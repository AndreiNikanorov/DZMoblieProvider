public class Main {
    public static void main(String[] args) {
        int account = 100;
        int addition = 999;
        int accAdd = account + addition;
        int bonusCalculation = addition / 100;
        int accAddBonus = accAdd + bonusCalculation;

        if (addition >= 1000) {
            System.out.println("За потраченные " + addition + " рублей мы дарим Вам " + bonusCalculation + " рублей." + " Доступный баланс " + accAddBonus + " рублей");
        } else {
            System.out.println("Пополнение: " + addition + " рублей." + " Доступный баланс " + accAdd + " рублей");
        }

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}