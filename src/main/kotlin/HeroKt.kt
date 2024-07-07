data class HeroKt(
    val name: String,
    val age: Int,
    val address: String,
) {
}

/**
 * 데이터 클래스로 마이그레이션
 * - 롬복이 적용된 클래스는 대부분 데이터 관련 클래스인 경우가 많다
 * - 코틀린의 데이터 클래스로 마이그레이션하는 것을 추천
 */