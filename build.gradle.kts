plugins {
    id("io.github.nickacpt.patchify.gradle") version "2.1.0-SNAPSHOT"
}

patchify {
    projectWorkspace("Mod", project(":mod")) {
        patches = rootProject.file("patches").toPath()

        initializer {
            decompileJar(project.file("libs/macros_mod_0.9.9_1.5.2_deobf.jar"), "src/main/java")
        }
    }
}