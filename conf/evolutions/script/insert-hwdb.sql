CREATE DATABASE  IF NOT EXISTS `orcadsystem` /*!40100 DEFAULT CHARACTER SET ascii */;
USE `orcadsystem`;

--
-- Table structure for table `part_type`
--

DROP TABLE IF EXISTS `part_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `part_type` (
  `PREFIX` int(11) NOT NULL,
  `PART_TYPE` varchar(255) NOT NULL,
  `CATEGORY` varchar(255) NOT NULL,
  `DESCRIPTION_RULE` varchar(255) DEFAULT NULL,
  `DEVICE_RULE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PREFIX`)
) ENGINE=InnoDB DEFAULT CHARSET=ascii;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `part_type`
--

LOCK TABLES `part_type` WRITE;
/*!40000 ALTER TABLE `part_type` DISABLE KEYS */;
INSERT INTO `part_type` VALUES (200,'RES-SMD','RESISTOR','RES-SMD;value,tolerance,package,power','R<Package>_<Value><Unit>_<Power>_<Tolerance>'),(210,'RES-DIP','RESISTOR','RES-DIP;value,tolerance,package,power','R<Package>_<Value><Unit>_<Power>_<Tolerance>'),(220,'RES-VR','RESISTOR','RES-VR;value,tolerance,package,power','R<Package>_<Value><Unit>_<Power>_<Tolerance>'),(230,'RES-ARRAY','RESISTOR','RES-ARRAY;value,qty of res,package','R<Package>_<Value><Unit>_<Power>_<Tolerance>'),(240,'RES-SPECIAL','RESISTOR','RES-SPECIAL;value,tolerance,power,info','R<Package>_<Value><Unit>_<Power>_<Tolerance>'),(301,'CAP-CER,SMD','CAPACITOR','CAP-CER,SMD;value,tolerance,package,voltage,material','C<Package>_<Value><Unit>_<Voltage>_<Tolerance>'),(302,'CAP-TA,SMD','CAPACITOR','CAP-TA,SMD;value,tolerance,package,voltage,ESR','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(303,'CAP-ALUM,SMD','CAPACITOR','CAP-ALUM,SMD;Value,tolerance,Package,voltage,ESR','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(304,'CAP-EDL','CAPACITOR','CAP-EDL,SMD;Value,tolerance,Package,voltage,ESR','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(305,'CAP-MICA,SMD','CAPACITOR','CAP-MICA,SMD;value,voltage,tolerance,package','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(306,'CAP-CER,DIP','CAPACITOR','CAP-CER,DIP;value,tolerance,package,voltage,material','C<Package>_<Value><Unit>_<Voltage>_<Tolerance>'),(307,'CAP-TA,DIP','CAPACITOR','CAP-TA,DIP;value,tolerance,package,voltage,ESR','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(308,'CAP-ALUM,DIP','CAPACITOR','CAP-ALUM,DIP;Value,tolerance,Package,voltage,ESR','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(309,'CAP-ARRAY','CAPACITOR','CAP-ARRAY;valueXqty  of  C,tolerance,package,voltage','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(310,'CAP-MICA,DIP','CAPACITOR','CAP-MICA,DIP;value,tolerance,voltage,package','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(311,'CAP-OXI_NIOB,SMD','CAPACITOR','CAP-OXI_NIOB,SMD;value,tolerance,voltage','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(312,'CAP-VR,SMD','CAPACITOR','CAP-VR,SMD;value,voltage,tolerance,package','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(313,'CAP-VR,DIP','CAPACITOR','CAP-VR,DIP;value,voltage,tolerance,package','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(314,'CAP-THIN_FILM,SMD','CAPACITOR','CAP-THIN_FILM,SMD;value,voltage,info','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(315,'CAP-PAS,SMD','CAPACITOR','CAP-PAS,SMD;Value,voltage,ESR,package','C<Type>_<Value><Unit>_<Voltage>_<Tolerance>'),(401,'DIODE-SWITCHING','DIODE','DIODE-SWITCHING;voltage,current,package,mfg1_part#','DIO_<Part Number>'),(402,'DIODE-RECTIFIER','DIODE','DIODE-RECTIFIER;voltage     DC,current,package,mfg1_part#','DIO_<Part Number>'),(403,'DIODE-ZENER','DIODE','DIODE-ZENER;voltage,power,package,mfg1_part#','DIO_<Part Number>'),(404,'DIODE-SCHOTTKY','DIODE','DIODE-SCHOTTKY;voltage,current,package,mfg1_part#','DIO_<Part Number>'),(405,'BRIDGE','DIODE','BRIDGE;voltage,current,package,mfg1_part#','DIO_<Part Number>'),(406,'DIODE-ARRAY','DIODE','DIODE-ARRAY;voltage,current,package,mfg1_part#','DIO_<Part Number>'),(501,'TRANS-BJT','TRANSISTOR','TRANS-BJT;type,voltage,current,package','<Part_Type>_<Sub type>_<Package>'),(502,'TRANS-POWER','TRANSISTOR','TRANS-POWER;type,voltage,current,package','<Part_Type>_<Sub type>_<Package>'),(503,'TRANS-BJT,ARRAY','TRANSISTOR','TRANS-BJT,ARRAY;NumberxType,voltage,current,package','<Part_Type>_<Sub type>_<Package>'),(504,'TRANS-DIGITAL','TRANSISTOR','TRANS-DIGITAL;type,voltage,current,package,R1/R2','<Part_Type>_<Sub type>_<Package>'),(505,'MOS-FET','TRANSISTOR','MOS-FET;type,voltage,current,package','<Part_Type>_<Sub type>_<Package>'),(506,'TRANS-RF','TRANSISTOR','TRANS-RF;type, Voltage - Collector Emitter Breakdown,Power-Max,Frequency,package','<Part_Type>_<Sub type>_<Package>'),(507,'JFET','TRANSISTOR','JFET;Type,Voltage Breakdown,Power ? Max,package','<Part_Type>_<Sub type>_<Package>'),(508,'RF-FET','TRANSISTOR','RF-FET;type,Frequency,Voltage ? Rated, Current Rating,package','<Part_Type>_<Sub type>_<Package>'),(509,'TRANS-BJT,ARRAY,Pre-Bias','TRANSISTOR','TRANS-BJT,ARRAY,Pre-Bias;type,voltage,current,package','<Part_Type>_<Sub type>_<Package>'),(510,'TRANS-BJT,Pre-Bias','TRANSISTOR','TRANS-BJT,Pre-Bias;type,voltage,current,package','<Part_Type>_<Sub type>_<Package>'),(511,'MOS-FET,ARRAY','TRANSISTOR','MOS-FET,ARRAY;type,voltage,current,package','<Part_Type>_<Sub type>_<Package>'),(600,'IC-CMOS LOGIC','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(710,'IC-MICROPROCESSOR','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(720,'IC-GRAPHIC CONT.','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(800,'IC-ANALOG MULTIPLEX','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(810,'IC-ANALOG SWITCH','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(820,'IC-RF SWITCH','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(830,'IC-LEVEL DRIVER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(840,'IC-MOTOR DRIVER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(850,'IC-RELAY DRIVER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(860,'IC-HALL EFFECT S/W','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(900,'IC-FLASH MEMORY','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(910,'IC-NAND FLASH','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(920,'IC-MCP','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(930,'IC-MEMORY CARD','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1000,'IC-AUDIO AMP','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1001,'IC-POWER AMP','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1002,'IC-RF AMP','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1003,'IC-VOLTAGE COMP.','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1004,'IC-BACKLIGHT DRIVER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1005,'IC-BATTERY','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1006,'IC-DC/DC CONVERTER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1007,'IC-MULTI REG.','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1008,'IC-POSI.FIXED REG.','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1009,'IC-POWER SUPERVISOR','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1010,'IC-RESET','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1011,'IC-VOL. DETECTOR','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1012,'IC-DEMODULATOR','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1013,'IC-TUNER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1014,'IC-BLUETOOTH','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1015,'IC-BUS TRANSCEIVER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1016,'IC-CODEC','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1017,'IC-CONTROLLER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1018,'IC-EXPANDER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1019,'IC-INTERFACE','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1020,'IC-LCD CONTROLLER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1021,'IC-MODEM','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1022,'IC-RECEIVER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1023,'IC-SWITCH','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1024,'IC-TRANSCEIVER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1025,'IC-TRANSMITTER','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1026,'IC-WIFI','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1027,'IC-SENSOR','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1028,'Other IC','IC','IC;Function,Value,Package,Info','IC_<Part number prefix>'),(1100,'LED-SMD','LED','LED-SMD;Voltage,Current,package,color','LED_<Part Number>'),(1101,'LED-DIP','LED','LED-DIP;Voltage,Current,package,color','LED_<Part Number>'),(1102,'LED-MATRIX','LED','LED-MATRIX; Configuration,Size,Colour, Voltage,Internal Connection','LED_<Part Number>'),(1103,'LED-IR','LED','LED-IR;   Wavelength,Emitter/Receiver,Voltage,Current,Viewing   Angle,Package','LED_<Part Number>'),(1104,'LED-7SEG','LED','LED-7SEG;Voltage,Current,package,color','LED_<Part Number>'),(1200,'FILTER-SMD','FILTER','FILTER;Type,package,info','<Part number prefix>'),(1210,'FILTER-DIP','FILTER','FILTER;Type,package,info','<Part number prefix>'),(1300,'CRYSTAL','OSCILLATOR','CRYSTAL;Freq,Tolerance,C_load,Package','XTAL_<Freq>_<P/N prefix>'),(1301,'OSCILLATOR','OSCILLATOR','OSCILLATOR;Frequency,tolerance,voltage,package','OSC_<Freq>_<P/N prefix>'),(1400,'VARACTOR','VARACTOR','VARACTOR;Value,Voltage,Package','VR_<Capacitance>@<Voltage>@<Freq>'),(1500,'THERMISTOR','THERMISTOR','THERMISTOR;type,Value,package','RT_<Resistance>@<Temp>'),(1600,'CONN-SMD','CONNECTOR','CONN-SMD;name,package,info','CONN_<info>_<P/N prefix>'),(1700,'CONN-DIP','CONNECTOR','CONN-DIP;type,package,info','CONN_<Interface>_<P/N prefix>'),(1810,'SWITCH','SWITCH','X','SW<No of pins>_<Sub type>_<Type>'),(1820,'PUSH-BUTTON','BUTTON','X','BTN<No of pins>_<Sub type>_<Type>'),(1900,'ME-PART','ME part','X','X'),(2000,'NON-STANDARD MATERIAL','NON-STANDARD MATERIAL','X','X'),(2100,'IND-SMD','INDUCTOR','IND-SMD;Value,tolerance,package,current,DCR','L<Package>_<Value><Unit>_<Current>_<Tolerance>'),(2110,'IND-DJ','INDUCTOR','IND-DJ; Inductance,Tolerance, Package','L<Package>_<Value><Unit>_<Current>_<Tolerance>'),(2120,'IND-ARRAY','INDUCTOR','IND-ARRAY;Value,tolerance,package,current,DCR','L<Package>_<Value><Unit>_<Current>_<Tolerance>'),(2130,'DELAY LINE','INDUCTOR','DELAY LINE;Value,tolerance,package,current,DCR','L<Package>_<Value><Unit>_<Current>_<Tolerance>'),(2140,'IND-DIP','INDUCTOR','IND-DIP;Value,tolerance,package,current,DCR','L<Package>_<Value><Unit>_<Current>_<Tolerance>'),(2400,'RELAY','RELAY','X','RL_<Control voltage<Unit>DC/AC'),(2500,'TRANSFORMER','TRANSFORMER','X','X'),(2700,'FUSE','FUSE','X','FUSE_<Trip current>_<Package>'),(2710,'FUSE-CLIP','FUSE','X','FUSE_<Trip current>_<Package>'),(2720,'FUSE-COVER','FUSE','X','FUSE_<Trip current>_<Package>'),(2800,'ESD','ESD','ESD;Direction,Capacitance,Work   Voltage,Package','ESD_<P/N prefix>'),(2810,'TVS-DIODE','TVS','TVS-DIODE;Direction,Power,Protect    Voltage,Package','ESD_<P/N prefix>'),(2820,'TVS-HYRIST','TVS','TVS-HYRIST;Voltage?Breakover,Current - Peak Pulse,Package','ESD_<P/N prefix>'),(2830,'TVS-VARISTOR','TVS','TVS-VARISTOR;Direction,Power,Protect    Voltage,Package','ESD_<P/N prefix>'),(2900,'FERRITE BEAD','FERRITE BEAD','FB;Value,Current,Package','FB<Package>_<Impedance>'),(3000,'MODULE','MODULE','X','X');
/*!40000 ALTER TABLE `part_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `button_switch`
--

DROP TABLE IF EXISTS `button_switch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `button_switch` (
  `CATEGORY` varchar(255) DEFAULT NULL,
  `PREFIX` int(11) DEFAULT NULL,
  `PART_TYPE` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `DEVICE` varchar(255) DEFAULT NULL,
  `MFG1` varchar(255) DEFAULT NULL,
  `MFG1_PART` varchar(255) NOT NULL,
  `DISTR1` varchar(255) DEFAULT NULL,
  `DISTR1_PART` varchar(255) DEFAULT NULL,
  `VALUE` varchar(255) DEFAULT NULL,
  `PACKAGE` varchar(255) DEFAULT NULL,
  `VOLTAGE` varchar(255) DEFAULT NULL,
  `CURRENT` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `TYPE` varchar(255) DEFAULT NULL,
  `SUBTYPE` varchar(255) DEFAULT NULL,
  `NO_OF_PINS` int(11) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `button_switch`
--

LOCK TABLES `button_switch` WRITE;
/*!40000 ALTER TABLE `button_switch` DISABLE KEYS */;
INSERT INTO `button_switch` VALUES ('SWITCH',1810,'SWITCH','SWITCH;ARRAY8,VERT,TH16',NULL,NULL,'KEY1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('BUTTON',1820,'PUSH-BUTTON','PUSH-BUTTON;DPDT,VERT,TH6',NULL,NULL,'KEY2',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `button_switch` ENABLE KEYS */;
UNLOCK TABLES;
