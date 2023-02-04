public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String greeting = "Hello Dunia Java";
        System.out.println(greeting);

        char[] dicodingChars = { 'd','i','c','o','d','i','n','g'};
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);

        System.out.println("============================");

// Mengetahui Panjang String
        String word = "dicoding";
        int length = word.length();
        System.out.println(length);

        System.out.println("============================");

// Mengambil Karakter dari sebuah string
        String dicoding = "dicoding";
        char result = dicoding.charAt(2);
        System.out.println(result);

        System.out.println("============================");

// Digunakan untuk memformat sebuah string
        String name = "Yayat Hidayatullah";
        String sf1 = String.format("Name is %s", name);

        System.out.println(sf1);
        System.out.println(String.format("Value is %f", 32.33434));
        System.out.println(String.format("Value is %32.12f", 32.33434));
        System.out.println(String.format("%d", 101));
        System.out.println(String.format("%f", 101.00));
        System.out.println(String.format("%x", 101));
        System.out.println(String.format("%c", 'c'));
        System.out.println(String.format("%d", 101));
        System.out.println(String.format("|%10d|", 101));
        System.out.println(String.format("|%-10d|", 101));
        System.out.println(String.format("|% d|", 101));
        System.out.println(String.format("|%010d|", 101));

        System.out.println("============================");

// Mengembalikan/menghasilkan substring berdasarkan indeks yang diberikan
        String Str = new String("Welcome to the Jungle!!!");
        System.out.println(Str.substring(10, 15));

        System.out.println("============================");

// Mengembalikan/menghasilkan nilai true atau false setelah mencocokkan karakter
        String str1 = "Welcome to BenchResources.Net weblog";

        boolean search1 = str1.contains("BenchRes");
        System.out.println(search1);

        boolean search2 = str1.contains("tech weblog");
        System.out.println(search2);

//        boolean search3 = str1.contains(null);
//        System.out.println(search3);

        System.out.println("============================");

//Memeriksa apakah nilai objek sama dengan nilai string.
        Object obj1 = new Object();
        Object obj2 = obj1;
        System.out.println(obj1.equals(obj2));

        Object ob1 = new Object();
        Object ob2 = new Object();
        System.out.println(ob1.equals(ob2));

        String obk1 = new String();
        String obk2 = new String();
        System.out.println(obk1.equals(obk2));

        String o1 = "Java Programming";
        String o2 = "Python Programming";
        System.out.println(o1.equals(o2));

        System.out.println("============================");

// Memeriksa apakah sebuah string itu kosong atau tidak.
        String mystr1 = "Hello";
        String mystr2 = "";
        System.out.println(mystr1.isEmpty());
        System.out.println(mystr2.isEmpty());

        System.out.println("============================");

// Mengkonsolidasikan sebuah string.
        String firstName = "Yayat ";
        String lastName  = "Hidayatullah";
        System.out.println(firstName.concat(lastName));

        String firstName1 = "Yayat ";
        String lastName1  = "Hidayatullah";
        System.out.println(firstName1 + "" + lastName1);

        System.out.println("============================");

// Mengganti suatu karakter di dalam string
        String mystr12= "Hello";
        System.out.println(mystr12.replace('l', 'p'));

        System.out.println("============================");

// Mengetahui indeks dari sebuah substring.
        String mystr3 = "Hello planet earth, you are a great planet.";
        System.out.println(mystr3.indexOf("earth"));

        System.out.println("============================");

// Mengubah format string menjadi huruf kecil semua
        String text = "Hello World";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        System.out.println("============================");

// Menghapus spasi awal dan akhir dari string.
        String text1 = "     Hello World      ";
        System.out.println(text1);
        System.out.println(text1.trim());

        System.out.println("============================");

// Mengkonversi tipe yang diberikan menjadi sebuah string
        Integer x = Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");
        Integer b = Integer.valueOf("1001", 2);

        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        System.out.println("============================");

// Membandingkan dua nilai
        String my1 = "Hello";
        String my2 = "Hello";
        System.out.println(my1.compareTo(my2));

        String my3 = "Hello1";
        String my4 = "Hello";
        System.out.println(my3.compareTo(my4));

        System.out.println("============================");
    }
}