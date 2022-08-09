package Gun24;

public class Odev270522 {
    public static void main(String[] args) {
        /*
        UYARI:  Arkadaşlar soruların kolay anlaşılması için her soruda 1 veya 2 tane örnek girdi ve çıktı verilmiştir.

ne yapılacağı bunlardan kolaylıkla anlaşılmaktadır. bilginize.



1-

ismi getCount() olan bir method oluşturun.

Parametre olarak bir String ArayList  ve  bir tane String

Return tipi int olmalı.



ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.


Örneğin;

ArrayList = Orange , Kiwi , Peach , Banana , Orange

String Orange:

Count = 2 olmalı. (Orange 2 kez yazılmış)



2-

getSum() isminde bir method oluşturun.

Parametresi ArrayList olmalı

Return tipi int olmalı.

ArrayList teki tüm sayıları birbiri ile toplayın.

return olarak toplam sonucu döndürün.

Örneğin;

Arraylist = 1,2,3,4,5

return 15 olmalı



3-

getLength() isminde bir method oluşturun.

Parametre olarak String ArrayList

Return tipi Integer ArrayList

ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

Tüm elementlerin uzunluğunu döndürün

Örneğin;

ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"

Tüm Stringlerin uzunluklarını yazdırın;

cevap: 10 ,  8 , 4 , 7 , 6 olmalı



4-

İsmi changelnArraylist() olan bir method oluşturun.

Parametre olarak String ArrayList, String s1, String s2

   Arraylist'te s1'i s2 olarak değiştirin

Return String arrayList



Örneğin;

Arraylist  "yellow" , "red" , "blue" , "red" , "blue"

s1 = blue

s2 = yellow

Tüm blue 'ları yellow'a dönüştürün.

cevap: "yellow" , "red" , "yellow" , "red" , "yellow"



5-



rotateList() isminde bir method oluşturun.

Parametre olarak String ArrayList

ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)

Tersten yazılmış halini return edin.





Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"


cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"



6-



hillNum() isminde bir method oluşturun.

Parametre olarak Integer ArrayList

Return tipi int,



Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.

Örneğin;

ArrayList  5,4,6,2,1

2, 6'dan küçük ve 1 den büyüktür.

Return 2 olmalı.





7-

common_values() isminde bir method oluşturun.

Parametre olarak 2 tane Integer ArrayList

Return tipi integer ArrayList olmalı

 İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün

**Örneğin;**

ArrayList 1:    3 , 2 , 5 , 6

ArrayList 2:     5 , 8 , 9

return  5 olmalı

**Örneğin;**

ArrayList 1: 8,7,9,6,7

ArrayList 2: 6,7,12,3,1

return 6 ve 7 olmalı





8-

secondMax()  isminde bir method oluşturun.

Parametre olarak integer ArrayList.

Return tipi int olmalı.

ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün

**ÖRN;**

ArrayList   --  5,3,4,6,7

CEVAP : 6



9-

rangeBtw() isminde bir method oluşturun.

Parametre olarak   **bir Arraylist**  ve **iki ayrı int**

return tipi int

 Arraylist'in **iki int arasında kaç değeri olduğunu** sayın.

return  **count**       (sayacı (count) döndürün.)

**Example (Örnek):**

ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28

min = 20

max = 30

return =  5    (20,22,25,28,30)

min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)





10-

Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]

Store all the elements in one arraylist and print the arraylist

Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.

**Örnek:**

```
**Girdi:**
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
**Çıktı:** [1,2,3,4,5,6,7,8,9]
```



11-

Create a method totalCount()

totalCount() isminde bir method oluşturun.

Parametresi  'Integer Hashset' olmalı

HashSetteki eleman sayısını alın.

totalCount'u döndürün.

_**Örnek:**_

hashset ; 4,2,3,1,7

cevap: 5



12-



changeSet() isminde bir method oluşturun.

Parametre olarak bir String HashSet   ve  iki String

return hashset olmalı

Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.

**ÖRNEK:**

hashset = "banana" , "strawberry" , "kiwi" , "pineapple"

String 1 = **banana**

String 2 = **peach**

**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"



13-

commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.

return tipi arraylist olmalı.

**ÖRNEĞİN:**

    İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**

     İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**

Ortak değerleri ArrayListe ekleyiniz.

çıktı:  "Germany" , "Brazil" ,"USA"

ArrayListi yazdırınız.





14-

removing() isminde bir method oluşturun.

Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.

Eğer Stringler LinkedHashset 'in içinde varsa, sil.

Return tipi linkedhashset

Örneğin,

linkedhashset : Germany , France , USA , Canada , Mexico , Brazil

String 1= Germany

String 2 = USA

 **Germany ve USA 'i sil.**

**Set'i döndür.**


         */
    }
}
