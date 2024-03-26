import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MobilePhone extends Brand implements FunctionInterface {
    private int phoneId;
    private String battery;
    private String phoneColor;
    private String camera;
    Map<Integer, MobilePhone> mobilePhoneMap = new TreeMap<>();
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);


    public MobilePhone(int brandId, int phoneId, String brandName, String productName, int perPrice,
                       String screenSize, String storageInfo, String ram, String battery, String phoneColor,
                       String camera, int stockCount, int discountRate) {
        super(brandId, brandName, productName, storageInfo, perPrice, discountRate, stockCount, screenSize, ram);
        this.phoneId = phoneId;
        this.battery = battery;
        this.phoneColor = phoneColor;
        this.camera = camera;

    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getPhoneColor() {
        return phoneColor;
    }

    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }


    @Override
    public void print() {
        System.out.println("Telefon Listesi");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat       |  Marka    | Depolama  | Ekran    | Kamera  | Pil      | RAM     | Renk     |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

        // Map içerisindeki her bir elemanı gezer ve fieldlara aktarıp yazdırır
        for (Map.Entry<Integer, MobilePhone> entry : mobilePhoneMap.entrySet()) {
            int id = entry.getKey();
            MobilePhone phone = entry.getValue();
            String productName = phone.getProductName();
            double price = phone.getPerPrice();
            String brandName = phone.getBrandName();
            String storageInfo = phone.getStorageInfo();
            String screenSize = phone.getScreenSize();
            String camera = phone.getCamera(); // Kamera bilgisini al
            String battery = phone.getBattery();
            String ram = phone.getRam();
            String color = phone.getPhoneColor(); // Renk bilgisini al

            System.out.printf("| %-2d | %-30s | %-3.2f TL | %-9s | %-9s | %-8s | %-7s | %-8s | %-7s | %-8s |\n",
                    id, productName, price, brandName, storageInfo, screenSize, camera, battery, ram, color);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    }
    @Override
    public void add() {
        super.addBrand();
        System.out.println("Kaçıncı Ürünü Ekliyorsunuz? Key Giriniz: ");
        int key = scanner.nextInt();

        System.out.println("Ürünün Markasının id Numarasını Giriniz: ");
        System.out.println("Apple = 21");
        System.out.println("Asus = 22");
        System.out.println("Casper = 23");
        System.out.println("Huawei = 24");
        System.out.println("Samsung = 25");
        System.out.println("Xiaomi = 26");
        int brandId = scanner.nextInt();

        System.out.print("Ürünün id Numarasını Giriniz: ");
        int phoneId = scanner.nextInt();

        System.out.print("Cep Telefonunun Modelini Giriniz: ");
        String productName = scanner2.nextLine();

        System.out.print("Ürünün Fiyatını Giriniz: ");
        int price = scanner.nextInt();

        System.out.print("Ürünün Ekran Boyutunu Giriniz: ");
        String screenSize = scanner2.nextLine();

        System.out.print("Ürünün Depolama Kapasitesini Giriniz: ");
        String storage = scanner2.nextLine();

        System.out.print("Ürünün RAM Bilgisini Giriniz: ");
        String ram = scanner2.nextLine();

        System.out.print("Ürünün Batarya Kapasitesini Giriniz: ");
        String battery = scanner2.nextLine();

        System.out.print("Ürünün Renginizi Giriniz: ");
        String color = scanner2.nextLine();

        System.out.print("Ürünün Kamera Megapikselini Giriniz: ");
        String camera = scanner2.nextLine();

        System.out.print("Ürünün Stok Adetini Giriniz: ");
        int stock = scanner.nextInt();

        System.out.print("Ürünün İndirim Oranını Giriniz: ");
        int discountRate = scanner.nextInt();

        mobilePhoneMap.put(key, new MobilePhone(brandId, phoneId, brandList.get(brandId), productName, price, screenSize, storage,
                ram, battery, color, camera, stock, discountRate));

    }
    @Override
    public void delete() {
        super.addBrand();
        System.out.println("Hangi Cep Telefonunu Listeden Çıkartmak İstiyorsunuz: ");
        print();
        int choose = scanner.nextInt();
        mobilePhoneMap.remove(choose);
    }
    @Override
    public void createMenu() {
        System.out.println("1 -> Ürünleri Listele");
        System.out.println("2 -> Ürün Ekle");
        System.out.println("3 -> Ürün Sil");
        System.out.println("0 -> Çıkış");
        System.out.println("Seçiminiz: ");
        int menuChoose = scanner.nextInt();
        switch (menuChoose) {
            case 1:
                print();
                break;
            case 2:
                add();
                print();
                break;
            case 3:
                delete();
                break;
            case 0:
                break;
            default:
                System.out.println("Hatalı Seçim!!");
        }
    }

}