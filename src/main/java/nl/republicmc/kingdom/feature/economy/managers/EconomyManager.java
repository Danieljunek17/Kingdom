package nl.republicmc.kingdom.feature.economy.managers;

import java.util.*;

public class EconomyManager {

    private int money;
    private List<UUID> kluistoegang;

    public EconomyManager(int money, List<UUID> kluistoegang) {
        this.money = money;
        this.kluistoegang = kluistoegang;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money = (this.money + money);
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<UUID> getKluistoegang() {
        return kluistoegang;
    }
}
