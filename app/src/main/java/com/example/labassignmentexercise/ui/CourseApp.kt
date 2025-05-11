package com.example.labassignmentexercise.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.labassignmentexercise.model.sampleCourses
import com.example.labassignmentexercise.ui.screens.CourseListScreen
import com.example.labassignmentexercise.ui.theme.CourseListTheme

class CourseApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourseListApp()
        }
    }
}

@Composable
fun CourseListApp(modifier: Modifier = Modifier) {
    CourseListTheme {
        CourseListScreen(
            courses = sampleCourses,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CourseListAppPreview() {
    CourseListApp()
}