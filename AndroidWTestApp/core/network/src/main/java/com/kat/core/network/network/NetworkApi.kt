package com.kat.core.network.network

import android.util.Log
import com.kat.core.data.data.model.PostalCode
import com.kat.core.data.data.result.RequestEnumStatus
import com.kat.core.data.data.storage.DBEngine
import com.kat.core.data.data.storage.StorageDao
import com.kat.core.network.network.connection.CheckNetworkConnection
import com.kat.core.network.network.util.Constants
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.URL
import java.nio.charset.Charset


class NetworkApi(
    private val storage: DBEngine,
    private val checkNetworkConnection: CheckNetworkConnection
): NetworkEngine {

    private val listPostalCode = mutableListOf<PostalCode>()

    override suspend fun getPostalCode() {
        if (checkNetworkConnection.checkNetworkAvailable()) {
            try {
                val inputStream = URL(Constants.PATH).openStream()
                val bufferedReader = BufferedReader(InputStreamReader(inputStream, Charset.forName("UTF-8")))
                var line = ""
                var currentLine = 0

                bufferedReader.readLine()
                while (bufferedReader.readLine().also { line = it } != null) {
                    val row = line.split(",")
                    currentLine ++
                    val postalCodeHashMap = PostalCode(
                        id = currentLine,
                        codDistrito = row[0],
                        codConcelho = row[1],
                        codLocalidade = row[2],
                        nomeLocalidade = row[3],
                        codArteria = row[4],
                        tipoArteria = row[5],
                        prep1 = row[6],
                        tituloArteria = row[7],
                        prep2 = row[8],
                        nomeArteria = row[9],
                        localArteria = row[10],
                        troco = row[11],
                        porta = row[12],
                        cliente = row[13],
                        numCodPostal = row[14],
                        extCodPostal = row[15],
                        desigPostal = row[16]
                    )
                    listPostalCode.add(postalCodeHashMap)
                }
                storage.insert(listPostalCode)
            } catch (e : IOException) {
                Log.d(NetworkApi::class.simpleName, e.toString())
            }
        }
    }

}