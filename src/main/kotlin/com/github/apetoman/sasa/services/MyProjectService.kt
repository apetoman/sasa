package com.github.apetoman.sasa.services

import com.intellij.openapi.project.Project
import com.github.apetoman.sasa.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
