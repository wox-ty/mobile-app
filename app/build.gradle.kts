plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}


android {
    namespace = "dev.tunera"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "dev.tunera"
        minSdk = 29
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.navigation.compose)

    // Spotify App Remote SDK
    implementation("com.github.spotify:android-app-remote-sdk:0.8.0-appremote_v2.1.0-auth")

    // Yandex Music API client
//    implementation("com.github.BadKiko:YandexMusicKAPI:master-550e6c71eb-1")

    // Для Moshi
//    implementation("com.squareup.moshi:moshi-kotlin:1.15.2")
//    implementation("com.squareup.moshi:moshi:1.15.2")

    // Для OAuth 2.0
//    implementation("com.auth0.android:jwtdecode:2.0.2")

    testImplementation(libs.junit)


    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}