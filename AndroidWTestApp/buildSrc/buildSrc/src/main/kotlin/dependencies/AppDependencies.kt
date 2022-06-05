package dependencies

import config.Version

object AppDependencies {

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlinVersion}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Version.kotlinVersion}"

    const val androidCoreKTX = "androidx.core:core-ktx:${Version.androidCoreKTX}"
    const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
    const val material = "com.google.android.material:material:${Version.material}"

    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    const val navigation = "androidx.navigation:navigation-fragment-ktx:${Version.navigation}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Version.navigation}"

    const val junit = "junit:junit:${Version.junit}"
    const val androidXJunit = "androidx.test.ext:junit:${Version.androidXJunit}"
    const val androidXEspresso = "androidx.test.espresso:espresso-core:${Version.androidXEspresso}"

    const val kotlinxCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"
    const val kotlinxSerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Version.kotlinxSerialization}"

    const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"
    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"
    const val lifecycleCommon = "androidx.lifecycle:lifecycle-common-java8:${Version.lifecycle}"
    const val lifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"

    const val koinCore = "io.insert-koin:koin-core:${Version.koin}"
    const val koinAndroid = "io.insert-koin:koin-android:${Version.koin}"
    const val koinAndroidExt = "io.insert-koin:koin-android-ext:${Version.koin}"
    const val koinExt = "io.insert-koin:koin-core-ext:${Version.koin}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.okHttp}"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Version.retrofit}"
    const val moshi = "com.squareup.moshi:moshi-kotlin:${Version.moshi}"
    const val moshiAdapters = "com.squareup.moshi:moshi-adapters:${Version.moshi}"

    const val picasso = "com.squareup.picasso:picasso:${Version.picasso}"

    const val roomRuntime = "androidx.room:room-runtime:${Version.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Version.room}"
    const val roomKtx = "androidx.room:room-ktx:${Version.room}"

}