import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Store {
    private Scanner scanner = new Scanner(System.in);
    Map<Integer, String> brandList = new TreeMap<>();
    MobilePhone mobilePhone = new MobilePhone(0, 0, "", "", 0, "", "", "",
            "", "", "", 0, 0);
    Notebook notebook = new Notebook(0, "", 0, "", "", "",
            "", 0, 0, 0);
    int choose;
    int brandMenuChoose;

    public void menu() {
        do {
            System.out.println("Patika Store Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            choose = scanner.nextInt();
            menuChooseControl();
        } while (choose != 0);
        System.out.println("Yeniden Bekleriz!");
    }

    public void printMobilePhone() {
        mobilePhone.print();
    }

    public void setBrandList(Map<Integer, String> brandList) {
        this.brandList = brandList;
    }

    public void printNotebook() {
        notebook.print();
    }

    public void menuChooseControl() {
        switch (choose) {
            case 1:
                notebook.createMenu();
                break;
            case 2:
                mobilePhone.createMenu();
                break;
            case 3:
                brandMenu();
                break;
            case 0:
                break;
            default:
                System.out.println("Wrong Number: ");
        }
    }

    public void addBrand() {
        brandList.clear();
        notebook.addBrand();
        brandList.putAll(notebook.brandList);
    }


    public void showBrandList() {
        addBrand();
        for (String brand : brandList.values()) {
            System.out.println("- " + brand);
        }
        System.out.print("Ana Menüye Dönmek İçin 0'a Basın: ");
        String input = scanner.next();

        if (isInteger(input)) {
            brandMenuChoose = Integer.parseInt(input);
            if (brandMenuChoose == 0) {
                menu();
            } else {
                System.out.println("Hatalı Giriş!! Tekrar Ana Menüye Dönmek İçin 0'a Basın.");
                while (brandMenuChoose != 0 || !isInteger(input)) {
                    System.out.print("Lütfen Geçerli Bir Sayı Girin: ");
                    input = scanner.next();
                    if (isInteger(input)) {
                        brandMenuChoose = Integer.parseInt(input);
                        if (brandMenuChoose == 0) {
                            menu();
                        }
                    }
                }
            }
        } else {
            System.out.println("Hatalı Giriş!! Lütfen Geçerli Bir Sayı Girin.");
            showBrandList();
        }

    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void brandMenu() {
        showBrandList();
    }

    public void start() {
        menu();
    }
}