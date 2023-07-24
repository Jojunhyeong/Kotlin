/* 일반적으로 휴대전화는 알림 요약을 제공합니다.

다음 코드 스니펫에 제공된 초기 코드에서 수신한 알림의 수에 따라 요약 메시지를 출력하는 프로그램을 작성합니다. 메시지에 다음을 포함해야 합니다.

알림이 100개 미만인 경우 정확한 알림 수
99+: 알림이 100개를 넘는 경우 알림 수

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
}

프로그램이 다음 줄을 출력하도록 printNotificationSummary() 함수를 완료합니다.


You have 51 notifications.
Your phone is blowing up! You have 99+ notifications.
 */

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int){
    if (numberOfMessages < 100){
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}