package com.github.lollipop190.myplugin.services

import com.github.lollipop190.myplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
