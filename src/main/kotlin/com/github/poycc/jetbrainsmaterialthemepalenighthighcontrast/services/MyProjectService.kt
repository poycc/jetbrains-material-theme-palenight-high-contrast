package com.github.poycc.jetbrainsmaterialthemepalenighthighcontrast.services

import com.github.poycc.jetbrainsmaterialthemepalenighthighcontrast.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
