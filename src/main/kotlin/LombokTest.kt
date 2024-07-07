fun main() {

    // 기본적으론 롬복을 사용하지 못한다
    val hero = Hero()
    hero.name = "스타크타워"
    println(hero.name)

    val heroKt = HeroKt(name = "아이언맨", age = 50, address = "스타크타워")
    println(heroKt)
}