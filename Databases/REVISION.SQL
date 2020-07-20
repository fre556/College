Create Schema Reservation;

use Reservation;

create table Hotel(Hotel_No int,HName varchar(35), Address varchar(100),City varchar(20),
    Constraint Hotel_HotelNo_PK primary key (Hotel_No));
    
Create table Room(Room_No int, Hotel_No int, RType varchar(20), Price int,
    Constraint Room_no_PK primary key (Room_No), constraint Hotel_Room_FK 
    foreign key (Hotel_No) References Hotel(Hotel_No));
    
Create Table Guest(Guest_No int, GName varchar(20), Address varchar(100), 
    constraint Guest_PK primary key (Guest_No));

Create table Booking(Room_No int, Hotel_No int, Guest_No int, Checkin_date date, 
    constraint Booking_Hotel_FK foreign key (Hotel_No) References Hotel(Hotel_No),
    constraint Booking_Room_FK foreign key (Room_No) References Room(Room_No),
    constraint Booking_Guest_FK foreign key (Guest_No) References Guest(Guest_No));
    
insert into Hotel
Values (001,'Maldron Hotel Dublin', 'Citywest', 'Dublin');

insert into Hotel
Values (002,'Maldron Hotel Dublin', 'Tallaght', 'Dublin');

insert into Hotel
Values (003,'Maldron Hotel Limerick', 'Roxoboro', 'Limerick');
