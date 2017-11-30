package com.byoutline.kickmaterial.dagger

import com.byoutline.kickmaterial.KickMaterialApp
import com.byoutline.kickmaterial.features.projectdetails.ProjectDetailsActivity
import com.byoutline.kickmaterial.model.DiscoverQuery
import com.byoutline.kickmaterial.model.DiscoverResponse
import com.byoutline.observablecachedfield.ObservableCachedFieldWithArg
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Sebastian Kacprzak <sebastian.kacprzak at byoutline.com> on 27.03.15.
 */
@Singleton
@Component(modules = [
    AppModule::class,
    MainActivityModule::class,
    ViewModelMapModule::class,
    ViewModelProvidersModule::class
])
interface AppComponent {
    fun inject(activity: ProjectDetailsActivity)
    fun inject(app: KickMaterialApp)

    val app: KickMaterialApp
    val discoverField: ObservableCachedFieldWithArg<DiscoverResponse, DiscoverQuery>
    @AnimationDurationMultiplier fun getAnimationDurationMultiplier(): Int
}
