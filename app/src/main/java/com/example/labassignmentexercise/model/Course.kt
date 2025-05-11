package com.example.labassignmentexercise.model

data class Course(
    val id: Int,
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: List<String>
)

val sampleCourses = listOf(
    Course(
        id = 1,
        title = "Mobile Application",
        code = "SECT-3113",
        creditHours = 3,
        description = "Learn to build mobile apps, focusing on UI, data handling, and platform-specific features (e.g., Android).",
        prerequisites = listOf("Basic programming", "Kotlin")
    ),
    Course(
        id = 2,
        title = "Computer Graphics",
        code = "SECT-3113",
        creditHours = 3,
        description = "Study techniques for creating 2D/3D images using code (e.g., rendering, modeling).",
        prerequisites = listOf("None")
    ),
    Course(
        id = 3,
        title = "Operating System",
        code = "SECT-3082",
        creditHours = 3,
        description = "Understand how OS manages processes, memory, and files.",
        prerequisites = listOf("Computer architecture", "C programming", "Data structures")
    )
)