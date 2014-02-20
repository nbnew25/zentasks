# --- Second database schema

# --- !Ups

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

# --- !Downs

DROP TABLE IF EXISTS `part_type`;
DROP TABLE IF EXISTS `button_switch`;
