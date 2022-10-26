import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Calculator {


    /**
     * Определить размер взноса в счет погашение долга перед финансовым учреждением можно вручную.
     * Формула расчета аннуитетного платежа (А) представляет собой следующее соотношение:
     * А=К*(П/(1+П)-М-1), где К – сумма кредита,
     * П – процентная ставка,
     * М – количество месяцев.
     * Такой прием используют при подсчете выплат по ипотеке и потребительским займам.
     * <p>
     * Дифференциальная система отличается уменьшением задолженности в период погашения долга.
     * Для расчета можно воспользоваться формулой
     * ДП = ОЗ / КП+ ОЗ х МС.
     * ОЗ – остаток задолженности,
     * КП – количество месяцев до погашения долга,
     * МС – месячная ставка (поделить кредитную ставку на 12).
     */

    public String monthPayment(int totalSum, double percent, int monthCount) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);

        double i = percent / 12;
        double k = (i * Math.pow(1 + i, monthCount)) / (Math.pow(1 + i, monthCount) - 1);
        return df.format(totalSum * k);
    }
}
