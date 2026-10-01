package ua.education.pagertest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform