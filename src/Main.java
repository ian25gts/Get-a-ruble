public class Main {
    public static void main(String[] args) {
        int currentAccount = 200; // Сумма на счету клиента
        int replenishmentAmount = 1200; // Сумма пополнения
        int bonusStep = 100; // Шаг бонуса
        int amountBonus = 1; // количество бонусов за шаг
        int check = currentAccount + replenishmentAmount; // расчет суммы счета клиента
        boolean bonus = replenishmentAmount > 1000;
        if (bonus) {
            int accruedBonus = replenishmentAmount * amountBonus / bonusStep; // расчет бонусов
            int finalBill = accruedBonus + check; // общая сумма с бонусами
            System.out.println("Ваш счет с бонусами: " + finalBill);
            System.out.println("Колличество начисленных бонусов: " + accruedBonus);
        }
        else {
            int finalBill = check;
            System.out.println("Ваш счет: " + finalBill);
        }
    }
}
