/*
	1. film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
	2. film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
	3. film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
	4. payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
*/

-- 1.
SELECT COUNT(*) FROM film WHERE length > (SELECT AVG(length) FROM film); 

-- 2.
SELECT COUNT(*) FROM film WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);

-- 3.
SELECT * FROM film WHERE rental_rate = (SELECT MIN(rental_rate) FROM film) AND replacement_cost = (SELECT MIN(replacement_cost) FROM film);

-- 4.
SELECT c.first_name, c.last_name, COUNT(*) FROM payment AS p INNER JOIN customer AS c ON p.customer_id = c.customer_id GROUP BY c.first_name, c.last_name ORDER BY COUNT(*) DESC;