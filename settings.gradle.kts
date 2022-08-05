pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.quiltmc.org/repository/release/")
        maven("https://raw.githubusercontent.com/NickAcPT/LightCraftMaven/main/")
    }
}

rootProject.name = "MacroKeybindingMod"

include("mod")