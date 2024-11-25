 # Food-Ordering-System

<!--
# DB - Design...


-- Step 1: Create the new database
CREATE DATABASE FoodOrderingSystem;

-- Step 2: Use the new database
USE FoodOrderingSystem;

-- Step 3: Create tables in the correct order

-- Create the Customer table first, since it will be referenced by the Orders table
CREATE TABLE Customer (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL, -- Storing hashed passwords
    mobile VARCHAR(15) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE
);

-- Create the Restaurant table
CREATE TABLE Restaurant (
    restaurant_id INT AUTO_INCREMENT PRIMARY KEY,
    restaurant_name VARCHAR(100) NOT NULL
);

-- Create the Food_Category table
CREATE TABLE Food_Category (
    category_id INT AUTO_INCREMENT PRIMARY KEY,
    category_name VARCHAR(100) NOT NULL
);

-- Create the Menu table
CREATE TABLE Menu (
    item_id INT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    restaurant_id INT NOT NULL,
    category_id INT NOT NULL,
    FOREIGN KEY (restaurant_id) REFERENCES Restaurant(restaurant_id),
    FOREIGN KEY (category_id) REFERENCES Food_Category(category_id)
);

-- Create the Orders table, referencing Customer and Restaurant
CREATE TABLE Orders (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    ordered_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    restaurant_id INT NOT NULL,
    customer_id INT NOT NULL,
    total_amount DECIMAL(10, 2) NOT NULL,
    status VARCHAR(50) NOT NULL,
    FOREIGN KEY (restaurant_id) REFERENCES Restaurant(restaurant_id),
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
);

-- Create the Order_Items table, referencing Orders and Menu
CREATE TABLE Order_Items (
    order_item_id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT NOT NULL,
    item_id INT NOT NULL,
    quantity INT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (order_id) REFERENCES Orders(order_id),
    FOREIGN KEY (item_id) REFERENCES Menu(item_id)
);

-- Create the Receipt table, referencing Orders
CREATE TABLE Receipt (
    receipt_id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT NOT NULL,
    FOREIGN KEY (order_id) REFERENCES Orders(order_id)
);


INSERT INTO Customer (customer_name, password, mobile, email) VALUES
('Aarav Sharma', 'Aarav@123', '9876543210', 'aarav.sharma@gmail.com'),
('Aditi Gupta', 'Aditi@123', '9876543211', 'aditi.gupta@yahoo.com'),
('Vihaan Singh', 'Vihaan@123', '9876543212', 'vihaan.singh@outlook.com'),
('Ananya Verma', 'Ananya@123', '9876543213', 'ananya.verma@rediffmail.com'),
('Rohan Mehta', 'Rohan@123', '9876543214', 'rohan.mehta@gmail.com'),
('Isha Patel', 'Isha@123', '9876543215', 'isha.patel@yahoo.com'),
('Aryan Joshi', 'Aryan@123', '9876543216', 'aryan.joshi@outlook.com'),
('Kavya Das', 'Kavya@123', '9876543217', 'kavya.das@rediffmail.com'),
('Aditya Malhotra', 'Aditya@123', '9876543218', 'aditya.malhotra@gmail.com'),
('Sanya Bhatia', 'Sanya@123', '9876543219', 'sanya.bhatia@yahoo.com'),
('Yash Jain', 'Yash@123', '9876543220', 'yash.jain@outlook.com'),
('Meera Desai', 'Meera@123', '9876543221', 'meera.desai@rediffmail.com'),
('Dhruv Reddy', 'Dhruv@123', '9876543222', 'dhruv.reddy@gmail.com'),
('Riya Nair', 'Riya@123', '9876543223', 'riya.nair@yahoo.com'),
('Kabir Rao', 'Kabir@123', '9876543224', 'kabir.rao@outlook.com'),
('Tanya Iyer', 'Tanya@123', '9876543225', 'tanya.iyer@rediffmail.com'),
('Nikhil Menon', 'Nikhil@123', '9876543226', 'nikhil.menon@gmail.com'),
('Sneha Pillai', 'Sneha@123', '9876543227', 'sneha.pillai@yahoo.com'),
('Arjun Chawla', 'Arjun@123', '9876543228', 'arjun.chawla@outlook.com'),
('Simran Chopra', 'Simran@123', '9876543229', 'simran.chopra@rediffmail.com'),
('Rajesh Kumar', 'Rajesh@123', '9876543230', 'rajesh.kumar@gmail.com'),
('Pooja Singh', 'Pooja@123', '9876543231', 'pooja.singh@yahoo.com'),
('Kunal Sharma', 'Kunal@123', '9876543232', 'kunal.sharma@outlook.com'),
('Naina Gupta', 'Naina@123', '9876543233', 'naina.gupta@rediffmail.com'),
('Siddharth Patel', 'Siddharth@123', '9876543234', 'siddharth.patel@gmail.com'),
('Anjali Mehta', 'Anjali@123', '9876543235', 'anjali.mehta@yahoo.com'),
('Rohit Malhotra', 'Rohit@123', '9876543236', 'rohit.malhotra@outlook.com'),
('Priya Das', 'Priya@123', '9876543237', 'priya.das@rediffmail.com'),
('Ashish Joshi', 'Ashish@123', '9876543238', 'ashish.joshi@gmail.com'),
('Maya Bhatia', 'Maya@123', '9876543239', 'maya.bhatia@yahoo.com'),
('Saurabh Jain', 'Saurabh@123', '9876543240', 'saurabh.jain@outlook.com'),
('Ira Desai', 'Ira@123', '9876543241', 'ira.desai@rediffmail.com'),
('Harsh Reddy', 'Harsh@123', '9876543242', 'harsh.reddy@gmail.com'),
('Neha Nair', 'Neha@123', '9876543243', 'neha.nair@yahoo.com'),
('Manav Rao', 'Manav@123', '9876543244', 'manav.rao@outlook.com'),
('Pallavi Iyer', 'Pallavi@123', '9876543245', 'pallavi.iyer@rediffmail.com'),
('Vivek Menon', 'Vivek@123', '9876543246', 'vivek.menon@gmail.com'),
('Ruchi Pillai', 'Ruchi@123', '9876543247', 'ruchi.pillai@yahoo.com'),
('Samarth Chawla', 'Samarth@123', '9876543248', 'samarth.chawla@outlook.com'),
('Ayesha Chopra', 'Ayesha@123', '9876543249', 'ayesha.chopra@rediffmail.com'),
('Karan Kumar', 'Karan@123', '9876543250', 'karan.kumar@gmail.com'),
('Divya Singh', 'Divya@123', '9876543251', 'divya.singh@yahoo.com'),
('Varun Sharma', 'Varun@123', '9876543252', 'varun.sharma@outlook.com'),
('Snehal Gupta', 'Snehal@123', '9876543253', 'snehal.gupta@rediffmail.com'),
('Raghav Patel', 'Raghav@123', '9876543254', 'raghav.patel@gmail.com'),
('Saloni Mehta', 'Saloni@123', '9876543255', 'saloni.mehta@yahoo.com'),
('Tushar Malhotra', 'Tushar@123', '9876543256', 'tushar.malhotra@outlook.com'),
('Ishita Das', 'Ishita@123', '9876543257', 'ishita.das@rediffmail.com'),
('Akshay Joshi', 'Akshay@123', '9876543258', 'akshay.joshi@gmail.com'),
('Radhika Bhatia', 'Radhika@123', '9876543259', 'radhika.bhatia@yahoo.com'),
('Vikas Jain', 'Vikas@123', '9876543260', 'vikas.jain@outlook.com'),
('Ritu Desai', 'Ritu@123', '9876543261', 'ritu.desai@rediffmail.com'),
('Keshav Reddy', 'Keshav@123', '9876543262', 'keshav.reddy@gmail.com'),
('Payal Nair', 'Payal@123', '9876543263', 'payal.nair@yahoo.com'),
('Arman Rao', 'Arman@123', '9876543264', 'arman.rao@outlook.com'),
('Sonal Iyer', 'Sonal@123', '9876543265', 'sonal.iyer@rediffmail.com');

select * from Customer;

INSERT INTO Food_Category (category_name) VALUES 
('Biryanis'),
('Curries'),
('Snacks'),
('Sweets'),
('Breakfast'),
('Rice Dishes'),
('Street Food'),
('Chutneys'),
('Dosas'),
('Breads'),
('Soups'),
('Pasta'),
('Pizzas'),
('Beverages'),
('Salads'),
('Seafood'),
('Sandwiches'),
('Grills'),
('Burgers'),
('Wraps'),
('Desserts'),
('Ice Creams'),
('Fruits'),
('Appetizers'),
('Vegetarian'),
('Shakes'),
('Mocktails'),
('Smoothies'),
('Waffles'),
('Noodles'),
('Fried Rice'),
('Tandoori'),
('Rolls'),
('Pickles'),
('Spicy Curries'),
('Hot Drinks'),
('Cold Drinks'),
('Pastries'),
('Muffins'),
('Cupcakes'),
('Healthy Bowls'),
('Kebabs'),
('Meat Platters'),
('Sushi'),
('Roti'),
('Pakoras'),
('Dumplings'),
('Chaats'),
('Idlis'),
('Pancakes'),
('Stews'),
('Casseroles'),
('Pies'),
('Tarts'),
('Gourmet Platters'),
('Falafels'),
('Stuffed Parathas'),
('Gravy Dishes'),
('Baked Goods'),
('Croissants'),
('Tacos'),
('Nachos'),
('Quesadillas'),
('Spring Rolls'),
('Hot Pot'),
('Crepes'),
('Barbecue'),
('Steaks'),
('Brownies'),
('Energy Bars'),
('Healthy Salads'),
('Mediterranean Dishes'),
('Asian Delights'),
('Fusion Foods');

INSERT INTO Restaurant (restaurant_name) VALUES 
('Hyderabad House'),
('Spicy Delight'),
('Kakatiya Dhaba'),
('Nizami Biryani House'),
('Deccan Spice'),
('Nandini Restaurant'),
('Royal Restaurant'),
('Chennai Chettinad'),
('Biryani Blues'),
('Tandoor Villa'),

('Saffron Kitchen'),
('Taste of Hyderabad'),
('Zaiqa Restaurant'),
('Grill House'),
('Biryani King'),
('Curry Leaf'),
('Saffron Flavors'),
('Deccan Food Court'),
('Hyderabadi Zaika'),
('Biryani Paradise'),

('Tandoori Nights'),
('Spice Route'),
('Hyderabad Tadka'),
('Biryani Hut'),
('Golden Harvest'),
('Salad Express'),
('Karan Kitchen'),
('Kadai Corner'),
('Grill Junction'),
('Dining Delight'),

('Flavor Fusion'),
('Spice It Up'),
('Delicious Dishes'),
('Chutney Street'),
('Foodie Heaven'),
('Eat Street'),
('Culinary Corner'),
('Ruchi Restaurant'),
('Taste Junction'),
('The Biryani Project'),

('Paradise Restro'),
('Masala Magic'),
('Shahi Darbar'),
('Curry Paradise'),
('Kitchen Express'),
('Food Fusion'),
('Zaiqa e Hyderabad'),
('Nizam Delight'),
('Punjabi Kitchen'),
('Hyderabadi Thali'),

('Bawarchi Delight'),
('Pista House'),
('Mehfil Restaurant'),
('Shadab Hotel'),
('Four Seasons'),
('Sarvi Bakers and Restaurant'),
('Hotel Grand'),
('Café Bahar'),
('Alpha Hotel'),
('Paradise Biryani'),

('Biryani by Kilo'),
('Chicha’s'),
('Pakwaan Grand'),
('Mandil Restaurant'),
('Royal Spice Kitchen'),
('Minerva Grand'),
('Hotel Green Park'),
('Sultan’s Kitchen'),
('Charminar Dine Inn'),
('Taste of Deccan'),

('Malgudi Days'),
('Gufaa Ohri’s'),
('Jewel of Nizam'),
('Firdaus'),
('Golconda Pavilion'),
('The Water Front'),
('Karachi Bakery Café'),
('The Fisherman’s Wharf'),
('Vivaha Bhojanambu'),
('Ohri’s Tansen'),

('Deccan Pavilion'),
('Mandi King'),
('Biryani Zone'),
('Zaika Hyderabadi'),
('Mehboob’s Kitchen'),
('Hotel Ajwa'),
('Chai Pani'),
('Irani Chai Café'),
('The Masala House'),
('Ruh Biryani'),

('Dawat-e-Khaas'),
('Shahi Degh'),
('Patiala Junction'),
('Nawab’s Feast'),
('Moghal’s Delight'),
('Zaika Zaaviya'),
('Deccan Delights'),
('Dil-E-Nawab'),
('The Spicy Affair'),
('Dine-In Deccan'),

('Haleem Junction'),
('Falaknuma Flavors'),
('King’s Kitchen'),
('Pearl City Biryani'),
('Charminar Treats'),
('Old City Feast'),
('Qutb Shahi Kitchen'),
('Begum’s Biryani'),
('Irani Delight'),
('Shahi Bhojan'),

('Hyderabad Treat'),
('Deccan Aroma'),
('Royal Zaika'),
('Zahedi’s Kitchen'),
('Shan-e-Hyderabad'),
('Nawab’s Delight'),
('Legacy of Nizams'),
('Biryani Express'),
('Deccan Heritage Kitchen'),
('Golden Hyderabadi Flavors');


-- Insert Menu Items for Restaurants

INSERT INTO Menu (item_name, price, restaurant_id, category_id) VALUES
-- For Biryani Restaurants
('Hyderabadi Biryani', 320.00, 1, 1),
('Dum Biryani', 350.00, 2, 1),
('Egg Biryani', 250.00, 3, 1),
('Mutton Biryani', 400.00, 4, 1),
('Paneer Biryani', 280.00, 5, 1),
('Keema Biryani', 330.00, 6, 1),
('Prawn Biryani', 350.00, 7, 1),
('Ambur Biryani', 310.00, 8, 1),
('Veg Biryani', 220.00, 9, 1),
('Chicken Biryani', 330.00, 10, 1),

-- For Curry Restaurants
('Chicken Curry', 280.00, 11, 2),
('Mutton Curry', 350.00, 12, 2),
('Paneer Butter Masala', 220.00, 13, 2),
('Dal Tadka', 160.00, 14, 2),
('Prawn Curry', 380.00, 15, 2),
('Fish Curry', 350.00, 16, 2),
('Kadai Chicken', 290.00, 17, 2),
('Shahi Paneer', 260.00, 18, 2),
('Chettinad Curry', 300.00, 19, 2),
('Methi Thepla Curry', 220.00, 20, 2),

-- For Snacks and Street Food Restaurants
('Pani Puri', 50.00, 21, 3),
('Vada Pav', 40.00, 22, 3),
('Bhel Puri', 60.00, 23, 3),
('Aloo Tikki', 90.00, 24, 3),
('Dahi Puri', 80.00, 25, 3),
('Masala Fries', 120.00, 26, 3),
('Pav Bhaji', 110.00, 27, 3),
('Samosa', 50.00, 28, 3),
('Corn and Cheese Balls', 140.00, 29, 3),
('Chaat', 100.00, 30, 3),

-- For Sweets Restaurants
('Rasgulla', 50.00, 31, 4),
('Gulab Jamun', 60.00, 32, 4),
('Mysore Pak', 120.00, 33, 4),
('Ladoo', 60.00, 34, 4),
('Barfi', 100.00, 35, 4),
('Peda', 80.00, 36, 4),
('Kaju Katli', 150.00, 37, 4),
('Jalebi', 70.00, 38, 4),
('Halwa', 90.00, 39, 4),
('Rabri', 100.00, 40, 4),

-- For Breakfast Restaurants
('Masala Dosa', 120.00, 41, 5),
('Idli Sambar', 80.00, 42, 5),
('Upma', 70.00, 43, 5),
('Poha', 60.00, 44, 5),
('Aloo Paratha', 90.00, 45, 5),
('Puri Bhaji', 100.00, 46, 5),
('Chole Bhature', 130.00, 47, 5),
('Oats', 80.00, 48, 5),
('Pancakes', 150.00, 49, 5),
('French Toast', 140.00, 50, 5),

-- For Rice Dishes Restaurants
('Fried Rice', 150.00, 1, 6),
('Sambar Rice', 120.00, 2, 6),
('Tomato Rice', 110.00, 3, 6),
('Puliyodarai', 100.00, 4, 6),
('Bisi Bele Bath', 120.00, 5, 6),
('Veg Pulao', 140.00, 6, 6),
('Lemon Rice', 110.00, 7, 6),
('Curd Rice', 100.00, 8, 6),
('Khichdi', 90.00, 9, 6),
('Tamarind Rice', 130.00, 10, 6),

-- For Grills Restaurants
('Tandoori Chicken', 250.00, 11, 7),
('Paneer Tikka', 220.00, 12, 7),
('Seekh Kebab', 280.00, 13, 7),
('Shami Kebab', 200.00, 14, 7),
('Tandoori Prawns', 300.00, 15, 7),
('Chicken Malai Tikka', 230.00, 16, 7),
('Grilled Fish', 350.00, 17, 7),
('Chicken Tikka', 220.00, 18, 7),
('Mutton Seekh Kebab', 280.00, 19, 7),
('Grilled Paneer', 220.00, 20, 7),

-- For Sandwiches Restaurants
('Veg Sandwich', 100.00, 21, 8),
('Cheese Sandwich', 120.00, 22, 8),
('Club Sandwich', 140.00, 23, 8),
('Grilled Veg Sandwich', 150.00, 24, 8),
('Grilled Cheese Sandwich', 180.00, 25, 8),
('Chicken Sandwich', 200.00, 26, 8),
('Chicken Cheese Sandwich', 220.00, 27, 8),
('Prawn Sandwich', 250.00, 28, 8),
('Egg Sandwich', 150.00, 29, 8),
('Tuna Sandwich', 240.00, 30, 8),

-- For Wraps Restaurants
('Chicken Shawarma', 220.00, 31, 9),
('Veg Wrap', 180.00, 32, 9),
('Paneer Wrap', 200.00, 33, 9),
('Falafel Wrap', 180.00, 34, 9),
('Mutton Shawarma', 250.00, 35, 9),
('Prawn Wrap', 280.00, 36, 9),
('Kebabs Wrap', 200.00, 37, 9),
('Chicken Caesar Wrap', 240.00, 38, 9),
('BBQ Chicken Wrap', 260.00, 39, 9),
('Grilled Veg Wrap', 220.00, 40, 9),

-- For Tacos and Nachos Restaurants
('Chicken Tacos', 180.00, 41, 10),
('Veg Tacos', 160.00, 42, 10),
('Fish Tacos', 220.00, 43, 10),
('Prawn Tacos', 250.00, 44, 10),
('Beef Tacos', 280.00, 45, 10),
('Cheese Nachos', 120.00, 46, 10),
('Beef Nachos', 140.00, 47, 10),
('Chicken Nachos', 150.00, 48, 10),
('Veg Nachos', 100.00, 49, 10),
('Loaded Nachos', 160.00, 50, 10);

INSERT INTO Orders (restaurant_id, customer_id, total_amount, status) VALUES
(1, 1, 1000.00, 'Completed'),
(1, 2, 1200.00, 'Pending'),
(1, 3, 900.00, 'Completed'),
(1, 4, 950.00, 'Cancelled'),
(1, 5, 1100.00, 'Completed'),
(1, 6, 1300.00, 'Pending'),
(1, 7, 850.00, 'Completed'),
(1, 8, 700.00, 'Completed'),
(1, 9, 950.00, 'Cancelled'),
(1, 10, 800.00, 'Completed'),

(2, 11, 1000.00, 'Completed'),
(2, 12, 1200.00, 'Pending'),
(2, 13, 900.00, 'Completed'),
(2, 14, 950.00, 'Cancelled'),
(2, 15, 1100.00, 'Completed'),
(2, 16, 1300.00, 'Pending'),
(2, 17, 850.00, 'Completed'),
(2, 18, 700.00, 'Completed'),
(2, 19, 950.00, 'Cancelled'),
(2, 20, 800.00, 'Completed'),

(3, 21, 1000.00, 'Completed'),
(3, 22, 1200.00, 'Pending'),
(3, 23, 900.00, 'Completed'),
(3, 24, 950.00, 'Cancelled'),
(3, 25, 1100.00, 'Completed'),
(3, 26, 1300.00, 'Pending'),
(3, 27, 850.00, 'Completed'),
(3, 28, 700.00, 'Completed'),
(3, 29, 950.00, 'Cancelled'),
(3, 30, 800.00, 'Completed'),

(4, 31, 1000.00, 'Completed'),
(4, 32, 1200.00, 'Pending'),
(4, 33, 900.00, 'Completed'),
(4, 34, 950.00, 'Cancelled'),
(4, 35, 1100.00, 'Completed'),
(4, 36, 1300.00, 'Pending'),
(4, 37, 850.00, 'Completed'),
(4, 38, 700.00, 'Completed'),
(4, 39, 950.00, 'Cancelled'),
(4, 40, 800.00, 'Completed'),

(5, 41, 1000.00, 'Completed'),
(5, 42, 1200.00, 'Pending'),
(5, 43, 900.00, 'Completed'),
(5, 44, 950.00, 'Cancelled'),
(5, 45, 1100.00, 'Completed'),
(5, 46, 1300.00, 'Pending'),
(5, 47, 850.00, 'Completed'),
(5, 48, 700.00, 'Completed'),
(5, 49, 950.00, 'Cancelled'),
(5, 50, 800.00, 'Completed'),

(6, 1, 1000.00, 'Completed'),
(6, 2, 1200.00, 'Pending'),
(6, 3, 900.00, 'Completed'),
(6, 4, 950.00, 'Cancelled'),
(6, 5, 1100.00, 'Completed'),
(6, 6, 1300.00, 'Pending'),
(6, 7, 850.00, 'Completed'),
(6, 8, 700.00, 'Completed'),
(6, 9, 950.00, 'Cancelled'),
(6, 10, 800.00, 'Completed'),



(7, 11, 1000.00, 'Completed'),
(7, 12, 1200.00, 'Pending'),
(7, 13, 900.00, 'Completed'),
(7, 14, 950.00, 'Cancelled'),
(7, 15, 1100.00, 'Completed'),
(7, 16, 1300.00, 'Pending'),
(7, 17, 850.00, 'Completed'),
(7, 18, 700.00, 'Completed'),
(7, 19, 950.00, 'Cancelled'),
(7, 20, 800.00, 'Completed');


-- For Restaurant 7
INSERT INTO Orders (restaurant_id, customer_id, total_amount, status) VALUES
(7, 1, 1000.00, 'Completed'),
(7, 2, 1200.00, 'Pending'),
(7, 3, 900.00, 'Completed'),
(7, 4, 950.00, 'Cancelled'),
(7, 5, 1100.00, 'Completed'),
(7, 6, 1300.00, 'Pending'),
(7, 7, 850.00, 'Completed'),
(7, 8, 700.00, 'Completed'),
(7, 9, 950.00, 'Cancelled'),
(7, 10, 800.00, 'Completed'),

-- For Restaurant 8
(8, 11, 1000.00, 'Completed'),
(8, 12, 1200.00, 'Pending'),
(8, 13, 900.00, 'Completed'),
(8, 14, 950.00, 'Cancelled'),
(8, 15, 1100.00, 'Completed'),
(8, 16, 1300.00, 'Pending'),
(8, 17, 850.00, 'Completed'),
(8, 18, 700.00, 'Completed'),
(8, 19, 950.00, 'Cancelled'),
(8, 20, 800.00, 'Completed'),

-- For Restaurant 9
(9, 21, 1000.00, 'Completed'),
(9, 22, 1200.00, 'Pending'),
(9, 23, 900.00, 'Completed'),
(9, 24, 950.00, 'Cancelled'),
(9, 25, 1100.00, 'Completed'),
(9, 26, 1300.00, 'Pending'),
(9, 27, 850.00, 'Completed'),
(9, 28, 700.00, 'Completed'),
(9, 29, 950.00, 'Cancelled'),
(9, 30, 800.00, 'Completed'),

-- For Restaurant 10
(10, 31, 1000.00, 'Completed'),
(10, 32, 1200.00, 'Pending'),
(10, 33, 900.00, 'Completed'),
(10, 34, 950.00, 'Cancelled'),
(10, 35, 1100.00, 'Completed'),
(10, 36, 1300.00, 'Pending'),
(10, 37, 850.00, 'Completed'),
(10, 38, 700.00, 'Completed'),
(10, 39, 950.00, 'Cancelled'),
(10, 40, 800.00, 'Completed'),

-- Repeat similarly for Restaurant 11 to 50
(11, 41, 1000.00, 'Completed'),
(11, 42, 1200.00, 'Pending'),
(11, 43, 900.00, 'Completed'),
(11, 44, 950.00, 'Cancelled'),
(11, 45, 1100.00, 'Completed'),
(11, 46, 1300.00, 'Pending'),
(11, 47, 850.00, 'Completed'),
(11, 48, 700.00, 'Completed'),
(11, 49, 950.00, 'Cancelled'),
(11, 50, 800.00, 'Completed'),

(12, 1, 1000.00, 'Completed'),
(12, 2, 1200.00, 'Pending'),
(12, 3, 900.00, 'Completed'),
(12, 4, 950.00, 'Cancelled'),
(12, 5, 1100.00, 'Completed'),
(12, 6, 1300.00, 'Pending'),
(12, 7, 850.00, 'Completed'),
(12, 8, 700.00, 'Completed'),
(12, 9, 950.00, 'Cancelled'),
(12, 10, 800.00, 'Completed'),


(13, 11, 1000.00, 'Completed'),
(13, 12, 1200.00, 'Pending'),
(13, 13, 900.00, 'Completed'),
(13, 14, 950.00, 'Cancelled'),
(13, 15, 1100.00, 'Completed'),
(13, 16, 1300.00, 'Pending'),
(13, 17, 850.00, 'Completed'),
(13, 18, 700.00, 'Completed'),
(13, 19, 950.00, 'Cancelled'),
(13, 20, 800.00, 'Completed');

-- For Restaurant 14
INSERT INTO Orders (restaurant_id, customer_id, total_amount, status) VALUES
(14, 1, 1000.00, 'Completed'),
(14, 2, 1200.00, 'Pending'),
(14, 3, 900.00, 'Completed'),
(14, 4, 950.00, 'Cancelled'),
(14, 5, 1100.00, 'Completed'),
(14, 6, 1300.00, 'Pending'),
(14, 7, 850.00, 'Completed'),
(14, 8, 700.00, 'Completed'),
(14, 9, 950.00, 'Cancelled'),
(14, 10, 800.00, 'Completed'),

-- For Restaurant 15
(15, 11, 1000.00, 'Completed'),
(15, 12, 1200.00, 'Pending'),
(15, 13, 900.00, 'Completed'),
(15, 14, 950.00, 'Cancelled'),
(15, 15, 1100.00, 'Completed'),
(15, 16, 1300.00, 'Pending'),
(15, 17, 850.00, 'Completed'),
(15, 18, 700.00, 'Completed'),
(15, 19, 950.00, 'Cancelled'),
(15, 20, 800.00, 'Completed'),

-- For Restaurant 16
(16, 21, 1000.00, 'Completed'),
(16, 22, 1200.00, 'Pending'),
(16, 23, 900.00, 'Completed'),
(16, 24, 950.00, 'Cancelled'),
(16, 25, 1100.00, 'Completed'),
(16, 26, 1300.00, 'Pending'),
(16, 27, 850.00, 'Completed'),
(16, 28, 700.00, 'Completed'),
(16, 29, 950.00, 'Cancelled'),
(16, 30, 800.00, 'Completed'),

-- For Restaurant 17
(17, 31, 1000.00, 'Completed'),
(17, 32, 1200.00, 'Pending'),
(17, 33, 900.00, 'Completed'),
(17, 34, 950.00, 'Cancelled'),
(17, 35, 1100.00, 'Completed'),
(17, 36, 1300.00, 'Pending'),
(17, 37, 850.00, 'Completed'),
(17, 38, 700.00, 'Completed'),
(17, 39, 950.00, 'Cancelled'),
(17, 40, 800.00, 'Completed'),

-- For Restaurant 18
(18, 41, 1000.00, 'Completed'),
(18, 42, 1200.00, 'Pending'),
(18, 43, 900.00, 'Completed'),
(18, 44, 950.00, 'Cancelled'),
(18, 45, 1100.00, 'Completed'),
(18, 46, 1300.00, 'Pending'),
(18, 47, 850.00, 'Completed'),
(18, 48, 700.00, 'Completed'),
(18, 49, 950.00, 'Cancelled'),
(18, 50, 800.00, 'Completed'),

-- For Restaurant 19
(19, 1, 1000.00, 'Completed'),
(19, 2, 1200.00, 'Pending'),
(19, 3, 900.00, 'Completed'),
(19, 4, 950.00, 'Cancelled'),
(19, 5, 1100.00, 'Completed'),
(19, 6, 1300.00, 'Pending'),
(19, 7, 850.00, 'Completed'),
(19, 8, 700.00, 'Completed'),
(19, 9, 950.00, 'Cancelled'),
(19, 10, 800.00, 'Completed'),

-- For Restaurant 20
(20, 11, 1000.00, 'Completed'),
(20, 12, 1200.00, 'Pending'),
(20, 13, 900.00, 'Completed'),
(20, 14, 950.00, 'Cancelled'),
(20, 15, 1100.00, 'Completed'),
(20, 16, 1300.00, 'Pending'),
(20, 17, 850.00, 'Completed'),
(20, 18, 700.00, 'Completed'),
(20, 19, 950.00, 'Cancelled'),
(20, 20, 800.00, 'Completed'),

-- For Restaurant 21
(21, 21, 1000.00, 'Completed'),
(21, 22, 1200.00, 'Pending'),
(21, 23, 900.00, 'Completed'),
(21, 24, 950.00, 'Cancelled'),
(21, 25, 1100.00, 'Completed'),
(21, 26, 1300.00, 'Pending'),
(21, 27, 850.00, 'Completed'),
(21, 28, 700.00, 'Completed'),
(21, 29, 950.00, 'Cancelled'),
(21, 30, 800.00, 'Completed'),

-- For Restaurant 22
(22, 31, 1000.00, 'Completed'),
(22, 32, 1200.00, 'Pending'),
(22, 33, 900.00, 'Completed'),
(22, 34, 950.00, 'Cancelled'),
(22, 35, 1100.00, 'Completed'),
(22, 36, 1300.00, 'Pending'),
(22, 37, 850.00, 'Completed'),
(22, 38, 700.00, 'Completed'),
(22, 39, 950.00, 'Cancelled'),
(22, 40, 800.00, 'Completed'),



(23, 41, 1000.00, 'Completed'),
(23, 42, 1200.00, 'Pending'),
(23, 43, 900.00, 'Completed'),
(23, 44, 950.00, 'Cancelled'),
(23, 45, 1100.00, 'Completed'),
(23, 46, 1300.00, 'Pending'),
(23, 47, 850.00, 'Completed'),
(23, 48, 700.00, 'Completed'),
(23, 49, 950.00, 'Cancelled'),
(23, 50, 800.00, 'Completed');

-- For Restaurant 24
INSERT INTO Orders (restaurant_id, customer_id, total_amount, status) VALUES
(24, 1, 1000.00, 'Completed'),
(24, 2, 1200.00, 'Pending'),
(24, 3, 900.00, 'Completed'),
(24, 4, 950.00, 'Cancelled'),
(24, 5, 1100.00, 'Completed'),
(24, 6, 1300.00, 'Pending'),
(24, 7, 850.00, 'Completed'),
(24, 8, 700.00, 'Completed'),
(24, 9, 950.00, 'Cancelled'),
(24, 10, 800.00, 'Completed'),

-- For Restaurant 25
(25, 11, 1000.00, 'Completed'),
(25, 12, 1200.00, 'Pending'),
(25, 13, 900.00, 'Completed'),
(25, 14, 950.00, 'Cancelled'),
(25, 15, 1100.00, 'Completed'),
(25, 16, 1300.00, 'Pending'),
(25, 17, 850.00, 'Completed'),
(25, 18, 700.00, 'Completed'),
(25, 19, 950.00, 'Cancelled'),
(25, 20, 800.00, 'Completed'),

-- For Restaurant 26
(26, 21, 1000.00, 'Completed'),
(26, 22, 1200.00, 'Pending'),
(26, 23, 900.00, 'Completed'),
(26, 24, 950.00, 'Cancelled'),
(26, 25, 1100.00, 'Completed'),
(26, 26, 1300.00, 'Pending'),
(26, 27, 850.00, 'Completed'),
(26, 28, 700.00, 'Completed'),
(26, 29, 950.00, 'Cancelled'),
(26, 30, 800.00, 'Completed'),

-- For Restaurant 27
(27, 31, 1000.00, 'Completed'),
(27, 32, 1200.00, 'Pending'),
(27, 33, 900.00, 'Completed'),
(27, 34, 950.00, 'Cancelled'),
(27, 35, 1100.00, 'Completed'),
(27, 36, 1300.00, 'Pending'),
(27, 37, 850.00, 'Completed'),
(27, 38, 700.00, 'Completed'),
(27, 39, 950.00, 'Cancelled'),
(27, 40, 800.00, 'Completed'),

-- For Restaurant 28
(28, 41, 1000.00, 'Completed'),
(28, 42, 1200.00, 'Pending'),
(28, 43, 900.00, 'Completed'),
(28, 44, 950.00, 'Cancelled'),
(28, 45, 1100.00, 'Completed'),
(28, 46, 1300.00, 'Pending'),
(28, 47, 850.00, 'Completed'),
(28, 48, 700.00, 'Completed'),
(28, 49, 950.00, 'Cancelled'),
(28, 50, 800.00, 'Completed'),

-- For Restaurant 29
(29, 1, 1000.00, 'Completed'),
(29, 2, 1200.00, 'Pending'),
(29, 3, 900.00, 'Completed'),
(29, 4, 950.00, 'Cancelled'),
(29, 5, 1100.00, 'Completed'),
(29, 6, 1300.00, 'Pending'),
(29, 7, 850.00, 'Completed'),
(29, 8, 700.00, 'Completed'),
(29, 9, 950.00, 'Cancelled'),
(29, 10, 800.00, 'Completed'),

-- For Restaurant 30
(30, 11, 1000.00, 'Completed'),
(30, 12, 1200.00, 'Pending'),
(30, 13, 900.00, 'Completed'),
(30, 14, 950.00, 'Cancelled'),
(30, 15, 1100.00, 'Completed'),
(30, 16, 1300.00, 'Pending'),
(30, 17, 850.00, 'Completed'),
(30, 18, 700.00, 'Completed'),
(30, 19, 950.00, 'Cancelled'),
(30, 20, 800.00, 'Completed'),

-- For Restaurant 31
(31, 21, 1000.00, 'Completed'),
(31, 22, 1200.00, 'Pending'),
(31, 23, 900.00, 'Completed'),
(31, 24, 950.00, 'Cancelled'),
(31, 25, 1100.00, 'Completed'),
(31, 26, 1300.00, 'Pending'),
(31, 27, 850.00, 'Completed'),
(31, 28, 700.00, 'Completed'),
(31, 29, 950.00, 'Cancelled'),
(31, 30, 800.00, 'Completed'),

-- For Restaurant 32
(32, 31, 1000.00, 'Completed'),
(32, 32, 1200.00, 'Pending'),
(32, 33, 900.00, 'Completed'),
(32, 34, 950.00, 'Cancelled'),
(32, 35, 1100.00, 'Completed'),
(32, 36, 1300.00, 'Pending'),
(32, 37, 850.00, 'Completed'),
(32, 38, 700.00, 'Completed'),
(32, 39, 950.00, 'Cancelled'),
(32, 40, 800.00, 'Completed'),


(33, 41, 1000.00, 'Completed'),
(33, 42, 1200.00, 'Pending'),
(33, 43, 900.00, 'Completed'),
(33, 44, 950.00, 'Cancelled'),
(33, 45, 1100.00, 'Completed'),
(33, 46, 1300.00, 'Pending'),
(33, 47, 850.00, 'Completed'),
(33, 48, 700.00, 'Completed'),
(33, 49, 950.00, 'Cancelled'),
(33, 50, 800.00, 'Completed');

-- For Restaurant 34
INSERT INTO Orders (restaurant_id, customer_id, total_amount, status) VALUES
(34, 1, 1000.00, 'Completed'),
(34, 2, 1200.00, 'Pending'),
(34, 3, 900.00, 'Completed'),
(34, 4, 950.00, 'Cancelled'),
(34, 5, 1100.00, 'Completed'),
(34, 6, 1300.00, 'Pending'),
(34, 7, 850.00, 'Completed'),
(34, 8, 700.00, 'Completed'),
(34, 9, 950.00, 'Cancelled'),
(34, 10, 800.00, 'Completed'),

-- For Restaurant 35
(35, 11, 1000.00, 'Completed'),
(35, 12, 1200.00, 'Pending'),
(35, 13, 900.00, 'Completed'),
(35, 14, 950.00, 'Cancelled'),
(35, 15, 1100.00, 'Completed'),
(35, 16, 1300.00, 'Pending'),
(35, 17, 850.00, 'Completed'),
(35, 18, 700.00, 'Completed'),
(35, 19, 950.00, 'Cancelled'),
(35, 20, 800.00, 'Completed'),

-- For Restaurant 36
(36, 21, 1000.00, 'Completed'),
(36, 22, 1200.00, 'Pending'),
(36, 23, 900.00, 'Completed'),
(36, 24, 950.00, 'Cancelled'),
(36, 25, 1100.00, 'Completed'),
(36, 26, 1300.00, 'Pending'),
(36, 27, 850.00, 'Completed'),
(36, 28, 700.00, 'Completed'),
(36, 29, 950.00, 'Cancelled'),
(36, 30, 800.00, 'Completed'),

-- For Restaurant 37
(37, 31, 1000.00, 'Completed'),
(37, 32, 1200.00, 'Pending'),
(37, 33, 900.00, 'Completed'),
(37, 34, 950.00, 'Cancelled'),
(37, 35, 1100.00, 'Completed'),
(37, 36, 1300.00, 'Pending'),
(37, 37, 850.00, 'Completed'),
(37, 38, 700.00, 'Completed'),
(37, 39, 950.00, 'Cancelled'),
(37, 40, 800.00, 'Completed'),

-- For Restaurant 38
(38, 41, 1000.00, 'Completed'),
(38, 42, 1200.00, 'Pending'),
(38, 43, 900.00, 'Completed'),
(38, 44, 950.00, 'Cancelled'),
(38, 45, 1100.00, 'Completed'),
(38, 46, 1300.00, 'Pending'),
(38, 47, 850.00, 'Completed'),
(38, 48, 700.00, 'Completed'),
(38, 49, 950.00, 'Cancelled'),
(38, 50, 800.00, 'Completed'),

-- For Restaurant 39
(39, 1, 1000.00, 'Completed'),
(39, 2, 1200.00, 'Pending'),
(39, 3, 900.00, 'Completed'),
(39, 4, 950.00, 'Cancelled'),
(39, 5, 1100.00, 'Completed'),
(39, 6, 1300.00, 'Pending'),
(39, 7, 850.00, 'Completed'),
(39, 8, 700.00, 'Completed'),
(39, 9, 950.00, 'Cancelled'),
(39, 10, 800.00, 'Completed'),

-- For Restaurant 40
(40, 11, 1000.00, 'Completed'),
(40, 12, 1200.00, 'Pending'),
(40, 13, 900.00, 'Completed'),
(40, 14, 950.00, 'Cancelled'),
(40, 15, 1100.00, 'Completed'),
(40, 16, 1300.00, 'Pending'),
(40, 17, 850.00, 'Completed'),
(40, 18, 700.00, 'Completed'),
(40, 19, 950.00, 'Cancelled'),
(40, 20, 800.00, 'Completed'),

-- For Restaurant 41
(41, 21, 1000.00, 'Completed'),
(41, 22, 1200.00, 'Pending'),
(41, 23, 900.00, 'Completed'),
(41, 24, 950.00, 'Cancelled'),
(41, 25, 1100.00, 'Completed'),
(41, 26, 1300.00, 'Pending'),
(41, 27, 850.00, 'Completed'),
(41, 28, 700.00, 'Completed'),
(41, 29, 950.00, 'Cancelled'),
(41, 30, 800.00, 'Completed'),

-- For Restaurant 42
(42, 31, 1000.00, 'Completed'),
(42, 32, 1200.00, 'Pending'),
(42, 33, 900.00, 'Completed'),
(42, 34, 950.00, 'Cancelled'),
(42, 35, 1100.00, 'Completed'),
(42, 36, 1300.00, 'Pending'),
(42, 37, 850.00, 'Completed'),
(42, 38, 700.00, 'Completed'),
(42, 39, 950.00, 'Cancelled'),
(42, 40, 800.00, 'Completed'),

-- For Restaurant 43
(43, 41, 1000.00, 'Completed'),
(43, 42, 1200.00, 'Pending'),
(43, 43, 900.00, 'Completed'),
(43, 44, 950.00, 'Cancelled'),
(43, 45, 1100.00, 'Completed'),
(43, 46, 1300.00, 'Pending'),
(43, 47, 850.00, 'Completed'),
(43, 48, 700.00, 'Completed'),
(43, 49, 950.00, 'Cancelled'),
(43, 50, 800.00, 'Completed'),

-- For Restaurant 44
(44, 1, 1000.00, 'Completed'),
(44, 2, 1200.00, 'Pending'),
(44, 3, 900.00, 'Completed'),
(44, 4, 950.00, 'Cancelled'),
(44, 5, 1100.00, 'Completed'),
(44, 6, 1300.00, 'Pending'),
(44, 7, 850.00, 'Completed'),
(44, 8, 700.00, 'Completed'),
(44, 9, 950.00, 'Cancelled'),
(44, 10, 800.00, 'Completed'),

-- For Restaurant 45
(45, 11, 1000.00, 'Completed'),
(45, 12, 1200.00, 'Pending'),
(45, 13, 900.00, 'Completed'),
(45, 14, 950.00, 'Cancelled'),
(45, 15, 1100.00, 'Completed'),
(45, 16, 1300.00, 'Pending'),
(45, 17, 850.00, 'Completed'),
(45, 18, 700.00, 'Completed'),
(45, 19, 950.00, 'Cancelled'),
(45, 20, 800.00, 'Completed'),

-- For Restaurant 46
(46, 21, 1000.00, 'Completed'),
(46, 22, 1200.00, 'Pending'),
(46, 23, 900.00, 'Completed'),
(46, 24, 950.00, 'Cancelled'),
(46, 25, 1100.00, 'Completed'),
(46, 26, 1300.00, 'Pending'),
(46, 27, 850.00, 'Completed'),
(46, 28, 700.00, 'Completed'),
(46, 29, 950.00, 'Cancelled'),
(46, 30, 800.00, 'Completed'),

-- For Restaurant 47
(47, 31, 1000.00, 'Completed'),
(47, 32, 1200.00, 'Pending'),
(47, 33, 900.00, 'Completed'),
(47, 34, 950.00, 'Cancelled'),
(47, 35, 1100.00, 'Completed'),
(47, 36, 1300.00, 'Pending'),
(47, 37, 850.00, 'Completed'),
(47, 38, 700.00, 'Completed'),
(47, 39, 950.00, 'Cancelled'),
(47, 40, 800.00, 'Completed'),

-- For Restaurant 48
(48, 41, 1000.00, 'Completed'),
(48, 42, 1200.00, 'Pending'),
(48, 43, 900.00, 'Completed'),
(48, 44, 950.00, 'Cancelled'),
(48, 45, 1100.00, 'Completed'),
(48, 46, 1300.00, 'Pending'),
(48, 47, 850.00, 'Completed'),
(48, 48, 700.00, 'Completed'),
(48, 49, 950.00, 'Cancelled'),
(48, 50, 800.00, 'Completed'),

-- For Restaurant 49
(49, 1, 1000.00, 'Completed'),
(49, 2, 1200.00, 'Pending'),
(49, 3, 900.00, 'Completed'),
(49, 4, 950.00, 'Cancelled'),
(49, 5, 1100.00, 'Completed'),
(49, 6, 1300.00, 'Pending'),
(49, 7, 850.00, 'Completed'),
(49, 8, 700.00, 'Completed'),
(49, 9, 950.00, 'Cancelled'),
(49, 10, 800.00, 'Completed'),

-- For Restaurant 50
(50, 11, 1000.00, 'Completed'),
(50, 12, 1200.00, 'Pending'),
(50, 13, 900.00, 'Completed'),
(50, 14, 950.00, 'Cancelled'),
(50, 15, 1100.00, 'Completed'),
(50, 16, 1300.00, 'Pending'),
(50, 17, 850.00, 'Completed'),
(50, 18, 700.00, 'Completed'),
(50, 19, 950.00, 'Cancelled'),
(50, 20, 800.00, 'Completed');


INSERT INTO Order_Items (order_id, item_id, quantity, amount) VALUES
(1, 1, 3, 780.00),
(2, 2, 4, 800.00),
(3, 3, 5, 1100.00),
(4, 4, 2, 360.00),
(5, 5, 3, 630.00),
(6, 6, 4, 720.00),
(7, 7, 1, 220.00),
(8, 8, 2, 540.00),
(9, 9, 3, 540.00),
(10, 10, 4, 200.00),
(11, 11, 3, 900.00),
(12, 12, 2, 460.00),
(13, 13, 5, 550.00),
(14, 14, 4, 750.00),
(15, 15, 2, 630.00),
(16, 16, 1, 120.00),
(17, 17, 3, 750.00),
(18, 18, 2, 280.00),
(19, 19, 4, 540.00),
(20, 20, 3, 810.00),
(21, 21, 5, 1000.00),
(22, 22, 2, 700.00),
(23, 23, 1, 110.00),
(24, 24, 4, 420.00),
(25, 25, 3, 690.00),
(26, 26, 2, 510.00),
(27, 27, 5, 1000.00),
(28, 28, 4, 380.00),
(29, 29, 3, 450.00),
(30, 30, 2, 540.00),
(31, 31, 1, 300.00),
(32, 32, 5, 850.00),
(33, 33, 4, 720.00),
(34, 34, 3, 900.00),
(35, 35, 2, 630.00),
(36, 36, 1, 210.00),
(37, 37, 4, 480.00),
(38, 38, 3, 650.00),
(39, 39, 5, 1000.00),
(40, 40, 2, 720.00),
(41, 41, 1, 550.00),
(42, 42, 3, 430.00),
(43, 43, 4, 570.00),
(44, 44, 2, 350.00),
(45, 45, 3, 480.00),
(46, 46, 4, 800.00),
(47, 47, 5, 950.00),
(48, 48, 2, 590.00),
(49, 49, 3, 720.00),
(50, 50, 4, 640.00);

INSERT INTO Order_Items (order_id, item_id, quantity, amount) VALUES
(1, 1, 3, 780.00),
(2, 2, 4, 800.00),
(3, 3, 5, 1100.00),
(4, 4, 2, 360.00),
(5, 5, 3, 630.00),
(6, 6, 4, 720.00),
(7, 7, 1, 220.00),
(8, 8, 2, 540.00),
(9, 9, 3, 540.00),
(10, 10, 4, 200.00),
(11, 11, 3, 900.00),
(12, 12, 2, 460.00),
(13, 13, 5, 550.00),
(14, 14, 4, 750.00),
(15, 15, 2, 630.00),
(16, 16, 1, 120.00),
(17, 17, 3, 750.00),
(18, 18, 2, 280.00),
(19, 19, 4, 540.00),
(20, 20, 3, 810.00),
(21, 21, 5, 1000.00),
(22, 22, 2, 700.00),
(23, 23, 1, 110.00),
(24, 24, 4, 420.00),
(25, 25, 3, 690.00),
(26, 26, 2, 510.00),
(27, 27, 5, 1000.00),
(28, 28, 4, 380.00),
(29, 29, 3, 450.00),
(30, 30, 2, 540.00),
(31, 31, 1, 300.00),
(32, 32, 5, 850.00),
(33, 33, 4, 720.00),
(34, 34, 3, 900.00),
(35, 35, 2, 630.00),
(36, 36, 1, 210.00),
(37, 37, 4, 480.00),
(38, 38, 3, 650.00),
(39, 39, 5, 1000.00),
(40, 40, 2, 720.00),
(41, 41, 1, 550.00),
(42, 42, 3, 430.00),
(43, 43, 4, 570.00),
(44, 44, 2, 350.00),
(45, 45, 3, 480.00),
(46, 46, 4, 800.00),
(47, 47, 5, 950.00),
(48, 48, 2, 590.00),
(49, 49, 3, 720.00),
(50, 50, 4, 640.00);

INSERT INTO Receipt (order_id) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),

(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),

(21),
(22),
(23),
(24),
(25),
(26),
(27),
(28),
(29),
(30),

(31),
(32),
(33),
(34),
(35),
(36),
(37),
(38),
(39),
(40),

(41),
(42),
(43),
(44),
(45),
(46),
(47),
(48),
(49),
(50);

INSERT INTO Receipt (order_id) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),

(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),

(21),
(22),
(23),
(24),
(25),
(26),
(27),
(28),
(29),
(30),

(31),
(32),
(33),
(34),
(35),
(36),
(37),
(38),
(39),
(40),

(41),
(42),
(43),
(44),
(45),
(46),
(47),
(48),
(49),
(50),

(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),

(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),

(21),
(22),
(23),
(24),
(25),
(26),
(27),
(28),
(29),
(30),

(31),
(32),
(33),
(34),
(35),
(36),
(37),
(38),
(39),
(40),

(41),
(42),
(43),
(44),
(45),
(46),
(47),
(48),
(49),
(50),

(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),

(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),

(21),
(22),
(23),
(24),
(25),
(26),
(27),
(28),
(29),
(30),

(31),
(32),
(33),
(34),
(35),
(36),
(37),
(38),
(39),
(40),

(41),
(42),
(43),
(44),
(45),
(46),
(47),
(48),
(49),
(50),

(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),

(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),

(21),
(22),
(23),
(24),
(25),
(26),
(27),
(28),
(29),
(30),

(31),
(32),
(33),
(34),
(35),
(36),
(37),
(38),
(39),
(40),

(41),
(42),
(43),
(44),
(45),
(46),
(47),
(48),
(49),
(50),

(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),

(11),
(12),
(13),
(14),
(15),
(16),
(17),
(18),
(19),
(20),

(21),
(22),
(23),
(24),
(25),
(26),
(27),
(28),
(29),
(30),

(31),
(32),
(33),
(34),
(35),
(36),
(37),
(38),
(39),
(40),

(41),
(42),
(43),
(44),
(45),
(46),
(47),
(48),
(49),
(50);















 -->
