package org.namyoku
import org.gradle.api.Plugin
import org.gradle.api.Project

class Fplugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("printHello") {
            it.doLast{
                println("Hello Pleaseeeeeeeeee")
            }
        }
    }
}
