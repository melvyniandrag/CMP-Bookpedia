package com.plcoding.bookpedia.di

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp
import org.koin.core.module.Module
import org.koin.dsl.module

// actual sort of implements the expects val from Modules.kt in commonMain
actual val platformModule: Module
    get() = module {
        single<HttpClientEngine>{ OkHttp.create() }
    }
