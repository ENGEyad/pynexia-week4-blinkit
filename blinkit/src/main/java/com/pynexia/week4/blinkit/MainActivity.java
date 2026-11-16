package com.pynexia.week4.blinkit;

import com.pynexia.week4.common.Catalog;
import com.pynexia.week4.common.CommerceActivity;
import com.pynexia.week4.common.Product;
import java.util.List;

public final class MainActivity extends CommerceActivity {
    @Override protected String storeName() { return "Blinkit Basket"; }
    @Override protected String storeSubtitle() { return "Daily groceries, at your pace"; }
    @Override protected int accentColor() { return 0xff188a45; }
    @Override protected boolean coffeeMode() { return false; }
    @Override protected boolean cloudMode() { return true; }
    @Override protected List<Product> sampleCatalog() { return Catalog.grocery(); }
}
