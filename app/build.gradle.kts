plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "id.android.dasar"
    compileSdk = 33

    defaultConfig {
        applicationId = "id.android.dasar"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        buildConfig = true
        viewBinding = true
        dataBinding = true
    }
    lint {
        abortOnError = false
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Multidex
    implementation("androidx.multidex:multidex:2.0.1")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.47")
    kapt("com.google.dagger:hilt-android-compiler:2.47")
    kapt("androidx.hilt:hilt-compiler:1.0.0")

    // Kotlin Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

    // Lifecycle (ViewModel & LiveData)
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")

    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.6.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.6.0")

    // Anko
    implementation("org.jetbrains.anko:anko:0.10.8")

    // Splitties
    implementation("com.louiscad.splitties:splitties-fun-pack-android-material-components-with-views-dsl:3.0.0")

    // Glide library
    implementation("com.github.bumptech.glide:glide:4.13.2")
    implementation("com.github.bumptech.glide:okhttp3-integration:4.13.2") {
        exclude("glide-parent")
    }
    kapt("com.github.bumptech.glide:compiler:4.13.2")
    implementation("com.pixplicity.sharp:library:1.1.0")

    // Circle Image
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    // lottie anim
    implementation ("com.airbnb.android:lottie:3.0.7")

    // Joda Time
    implementation ("joda-time:joda-time:2.10.10")


    // debugging
    implementation("com.jakewharton.timber:timber:5.0.1")
    implementation("com.facebook.stetho:stetho:1.6.0")
    implementation("com.facebook.stetho:stetho-okhttp3:1.6.0")
//    implementation("io.sentry:sentry-android:5.1.2")
    implementation("org.slf4j:slf4j-nop:1.7.30")
}