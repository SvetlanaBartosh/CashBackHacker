package ru.netology;

public class CashBackHackServiceTest {
    @org.junit.Test
    public void TestAmountZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void TestCashBack() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void TestAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        org.junit.Assert.assertEquals(actual, expected);
    }
}
