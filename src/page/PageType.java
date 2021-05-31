package page;

import page.menu.MenuPage;
import page.payment.CouponPage;
import page.payment.CreditCardPage;
import page.payment.PayPage;
import page.payment.PaymentPage;
import page.start.StartPage;
import java.sql.SQLException;

// enum => 열거형 클래스라고 보시면 됩니다.
// 페이지 전환을 담당
public enum PageType {
    EMPTY_PAGE, START_PAGE, MENU_PAGE, PAY_PAGE, COUPON_PAGE, PAYMENT_PAGE, CARD_PAGE, CREDITCARD_PAGE;

    public KioskPage createKioskPage() throws SQLException {
        KioskPage kioskPage = null;
        if (this == EMPTY_PAGE) {
            kioskPage = new KioskPage() {};
        } else if (this == START_PAGE) {
            kioskPage = new StartPage();
        } else if (this == MENU_PAGE) {
            kioskPage = new MenuPage();
        } else if (this == PAY_PAGE) {
        	kioskPage = new PayPage();
        } else if (this == PAYMENT_PAGE) {
        	kioskPage = new PaymentPage();
        } else if (this == COUPON_PAGE) {
        	kioskPage = new CouponPage();
        } else if (this == CREDITCARD_PAGE) {
            kioskPage = new CreditCardPage();
        }

        return kioskPage;
    }
}
