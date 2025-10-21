plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.valotrackerpro.valotracker_pro_v4"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.valotrackerpro.valotracker_pro_v4"
        minSdk = 21
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        manifestPlaceholders["appAuthRedirectScheme"] = "com.valotrackerpro"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")
}
