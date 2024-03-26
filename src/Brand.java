import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public abstract class Brand {
    private int brandId;
    private String productName;
    private int perPrice;
    private int discountRate;
    private int stockCount;
    private String screenSize;
    private String brandName;
    private String storageInfo;
    private String ram;
    Map<Integer, String> brandList = new TreeMap<>();


    public Brand(int brandId, String brandName, String productName, String storageInfo, int perPrice, int discountRate, int stockCount, String screenSize, String ram) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.productName = productName;
        this.storageInfo = storageInfo;
        this.perPrice = perPrice;
        this.discountRate = discountRate;
        this.stockCount = stockCount;
        this.screenSize = screenSize;
        this.brandName = brandName;
        this.ram = ram;
    }

    public int getBrandId() {
        return brandId;
    }

    public String getStorageInfo() {
        return storageInfo;
    }

    public void setStorageInfo(String storageInfo) {
        this.storageInfo = storageInfo;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPerPrice() {
        return perPrice;
    }

    public void setPerPrice(int perPrice) {
        this.perPrice = perPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void addBrand() {
        brandList.put(21, "Apple");
        brandList.put(22, "Asus");
        brandList.put(23, "Casper");
        brandList.put(24, "HP");
        brandList.put(25, "Huawei");
        brandList.put(26, "Lenovo");
        brandList.put(27, "Monster");
        brandList.put(28, "Samsung");
        brandList.put(29, "Xiaomi");
    }

}