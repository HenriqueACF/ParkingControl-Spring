CREATE TABLE TB_PARKING_SPOT(
                                id VARCHAR(255) NOT NULL PRIMARY KEY,
                                parkingSpotNUmber VARCHAR(10) NOT NULL,
                                licensePlateCar VARCHAR(7) NOT NULL,
                                brandCar VARCHAR(70) NOT NULL ,
                                modelCar VARCHAR(70) NOT NULL,
                                colorCar VARCHAR(70) NOT NULL,
                                registrationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                responsibleName VARCHAR(130) NOT NULL,
                                apartment VARCHAR(30) NOT NULL,
                                block VARCHAR(30) NOT NULL
)