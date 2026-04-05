package dev.xevoider.dungeon

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform