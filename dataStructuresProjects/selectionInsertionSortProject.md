# Project 1(Selection Insertion Sort)

### [22,27,16,2,18,6] -> Insertion Sort

1. Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

        Insertion Sort : Her adımda bir eleman seçilir, seçilen eleman kendisinden önce gelen elemanlarla karşılaştırılır. Eğer önceki elemandan küçük ise sağa kaydırılır.
        - Step 1: [ 16 , 22, 27 , 2 , 18 , 6 ]
        - Step 2: [ 2 , 16 , 22, 27 , 18 , 6 ]
        - Step 3: [ 2 , 6 , 16 , 22, 27 , 18 ]
        - Step 4: [ 2, 6 , 16 , 18 , 22 , 27 ]
    

2. Big-O gösterimini yazınız.

        O(n^2)

3. Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

    - **Average case:** Aradığımız sayının ortada olması
    - **Worst case:** Aradığımız sayının sonda olması
    - **Best case:** Aradığımız sayının dizinin en başında olması.
    
            18 sayısı dizinin ortalarında bulunduğundan Average Case'e girer.
    
4. [ 7 , 3 , 5 , 8 , 2 , 9 , 4 , 15 , 6 ] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.
    
        Selection Sort : Her adımda en küçük eleman seçilir ve uygun konuma yerleştirilir.
        -Step 1 : [ 2 , 27 , 3 , 5 , 8 , 9 , 4 , 15 , 6 ]
        -Step 2 : [ 2 , 3 , 27 , 5 , 8 , 9 , 4 , 15 , 6 ]
        -Step 3 : [ 2 , 3 , 4 , 27 , 5 , 8 , 9 , 15 , 6 ]
        -Step 4 : [ 2 , 3 , 4 , 5 , 27 , 8 , 9 , 15 , 6 ]
    

