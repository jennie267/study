package pattern.strategy;

import java.util.List;

/**
 * 가격 계산 모듈에 할인 정책 구현이 포함된 코드
 */
public class Ex7_1 {
    public class Calculator {
        public int calculate(boolean firstGuest, List<Item> items) {
            int sum = 0;
            for (Item item : items) {
                if (firstGuest)
                    sum += (int) (item.getPrice() * 0.9);   // 첫 손님 10% 할인
                else if (! item.isFresh())
                    sum += (int) (item.getPrice() * 0.8);   // 덜 신선한 것 20% 할인
                else
                    sum += item.getPrice();
            }
            return sum;
        }
    }

    public class Item {
        int price;
        boolean isFresh;

        public Item(int price, boolean isFresh) {
            this.price = price;
            this.isFresh = isFresh;
        }

        public int getPrice() {
            return this.price;
        }
        public boolean isFresh() {
            return this.isFresh;
        }
    }
}
