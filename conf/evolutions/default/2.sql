# --- Second database schema

# --- !Ups

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
-- Table structure for table `cap_cer`
--

DROP TABLE IF EXISTS `cap_cer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cap_cer` (
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
  `TOLERANCE` varchar(255) DEFAULT NULL,
  `VOLTAGE` varchar(255) DEFAULT NULL,
  `MATERIAL` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `ALT_SYMBOLS` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cap_tant_alum_others`
--

DROP TABLE IF EXISTS `cap_tant_alum_others`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cap_tant_alum_others` (
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
  `TOLERANCE` varchar(255) DEFAULT NULL,
  `VOLTAGE` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `ESR` varchar(255) DEFAULT NULL,
  `INFORMATION` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `connector`
--

DROP TABLE IF EXISTS `connector`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `connector` (
  `CATEGORY` varchar(255) DEFAULT NULL,
  `PREFIX` int(11) DEFAULT NULL,
  `PART_TYPE` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `DEVICE` varchar(255) DEFAULT NULL,
  `MFG1` varchar(255) DEFAULT NULL,
  `MFG1_PART` varchar(255) NOT NULL,
  `DISTR1` varchar(255) DEFAULT NULL,
  `DISTR1_PART` varchar(255) DEFAULT NULL,
  `PART_NUMBER_PREFIX` varchar(255) DEFAULT NULL,
  `VALUE` varchar(255) DEFAULT NULL,
  `PACKAGE` varchar(255) DEFAULT NULL,
  `INFORMATION` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `diode_led`
--

DROP TABLE IF EXISTS `diode_led`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diode_led` (
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
  `CURRENT` varchar(255) DEFAULT NULL,
  `RATING` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `COLOR` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `diode_zener`
--

DROP TABLE IF EXISTS `diode_zener`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diode_zener` (
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
  `CURRENT` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `esd_tvs`
--

DROP TABLE IF EXISTS `esd_tvs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `esd_tvs` (
  `CATEGORY` varchar(255) DEFAULT NULL,
  `PREFIX` int(11) DEFAULT NULL,
  `PART_TYPE` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `DEVICE` varchar(255) DEFAULT NULL,
  `MFG1` varchar(255) DEFAULT NULL,
  `MFG1_PART` varchar(255) NOT NULL,
  `DISTR1` varchar(255) DEFAULT NULL,
  `DISTR1_PART` varchar(255) DEFAULT NULL,
  `PART_NUMBER_PREFIX` varchar(255) DEFAULT NULL,
  `VALUE` varchar(255) DEFAULT NULL,
  `PACKAGE` varchar(255) DEFAULT NULL,
  `VOLTAGE` varchar(255) DEFAULT NULL,
  `DIRECTION` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ferrite_bead`
--

DROP TABLE IF EXISTS `ferrite_bead`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ferrite_bead` (
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
  `CURRENT` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `DCR` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `filter`
--

DROP TABLE IF EXISTS `filter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `filter` (
  `CATEGORY` varchar(255) DEFAULT NULL,
  `PREFIX` int(11) DEFAULT NULL,
  `PART_TYPE` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `DEVICE` varchar(255) DEFAULT NULL,
  `MFG1` varchar(255) DEFAULT NULL,
  `MFG1_PART` varchar(255) NOT NULL,
  `PART_NUMBER_PREFIX` varchar(255) DEFAULT NULL,
  `DISTR1` varchar(255) DEFAULT NULL,
  `DISTR1_PART` varchar(255) DEFAULT NULL,
  `VALUE` varchar(255) DEFAULT NULL,
  `TYPE` varchar(255) DEFAULT NULL,
  `SUBTYPE` varchar(255) DEFAULT NULL,
  `PACKAGE` varchar(255) DEFAULT NULL,
  `INFORMATION` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `fuse`
--

DROP TABLE IF EXISTS `fuse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fuse` (
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
  `CURRENT` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ic`
--

DROP TABLE IF EXISTS `ic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ic` (
  `CATEGORY` varchar(255) DEFAULT NULL,
  `PREFIX` int(11) DEFAULT NULL,
  `PART_TYPE` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `DEVICE` varchar(255) DEFAULT NULL,
  `MFG1` varchar(255) DEFAULT NULL,
  `MFG1_PART` varchar(255) NOT NULL,
  `PART_NUMBER_PREFIX` varchar(255) DEFAULT NULL,
  `DISTR1` varchar(255) DEFAULT NULL,
  `DISTR1_PART` varchar(255) DEFAULT NULL,
  `VALUE` varchar(255) DEFAULT NULL,
  `PACKAGE` varchar(255) DEFAULT NULL,
  `INFORMATION` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `inductor`
--

DROP TABLE IF EXISTS `inductor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inductor` (
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
  `TOLERANCE` varchar(255) DEFAULT NULL,
  `CURRENT` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `DCR` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `me_part`
--

DROP TABLE IF EXISTS `me_part`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `me_part` (
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
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `module`
--

DROP TABLE IF EXISTS `module`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `module` (
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
  `NAME` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `non_standard_material`
--

DROP TABLE IF EXISTS `non_standard_material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `non_standard_material` (
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
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `oscillator_crystal`
--

DROP TABLE IF EXISTS `oscillator_crystal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oscillator_crystal` (
  `CATEGORY` varchar(255) DEFAULT NULL,
  `PREFIX` int(11) DEFAULT NULL,
  `PART_TYPE` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `DEVICE` varchar(255) DEFAULT NULL,
  `MFG1` varchar(255) DEFAULT NULL,
  `MFG1_PART` varchar(255) NOT NULL,
  `DISTR1` varchar(255) DEFAULT NULL,
  `DISTR1_PART` varchar(255) DEFAULT NULL,
  `PART_NUMBER_PREFIX` varchar(255) DEFAULT NULL,
  `VALUE` varchar(255) DEFAULT NULL,
  `PACKAGE` varchar(255) DEFAULT NULL,
  `TOLERANCE` varchar(255) DEFAULT NULL,
  `FREQUENCY` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
-- Table structure for table `relay`
--

DROP TABLE IF EXISTS `relay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relay` (
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
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `resistor`
--

DROP TABLE IF EXISTS `resistor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resistor` (
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
  `TOLERANCE` double DEFAULT NULL,
  `POWER` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `ALT_SYMBOLS` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `thermistor`
--

DROP TABLE IF EXISTS `thermistor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `thermistor` (
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
  `TYPE` varchar(255) DEFAULT NULL,
  `SUBTYPE` varchar(255) DEFAULT NULL,
  `FUNCTION` varchar(255) DEFAULT NULL,
  `PACKAGE` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `transformer`
--

DROP TABLE IF EXISTS `transformer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transformer` (
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
  `TOLERANCE` varchar(255) DEFAULT NULL,
  `CURRENT` varchar(255) DEFAULT NULL,
  `FREQUENCY` varchar(255) DEFAULT NULL,
  `RATIO` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `DCR` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `transistor`
--

DROP TABLE IF EXISTS `transistor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transistor` (
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
  `TYPE` varchar(255) DEFAULT NULL,
  `SUBTYPE` varchar(255) DEFAULT NULL,
  `PACKAGE` varchar(255) DEFAULT NULL,
  `VOLTAGE` varchar(255) DEFAULT NULL,
  `CURRENT` varchar(255) DEFAULT NULL,
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
  `ACCOUNT_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_DATE` datetime DEFAULT NULL,
  `SCHEMATIC_PART` varchar(255) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  PRIMARY KEY (`MFG1_PART`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `varactor`
--

DROP TABLE IF EXISTS `varactor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `varactor` (
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
  `PCB_FOOTPRINT` varchar(255) DEFAULT NULL,
  `NI_MARK` varchar(255) DEFAULT NULL,
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
DROP TABLE IF EXISTS `cap_cer`;
DROP TABLE IF EXISTS `cap_tant_alum_others`;
DROP TABLE IF EXISTS `connector`;
DROP TABLE IF EXISTS `diode_led`;
DROP TABLE IF EXISTS `diode_zener`;
DROP TABLE IF EXISTS `esd_tvs`;
DROP TABLE IF EXISTS `ferrite_bead`;
DROP TABLE IF EXISTS `filter`;
DROP TABLE IF EXISTS `fuse`;
DROP TABLE IF EXISTS `ic`;
DROP TABLE IF EXISTS `inductor`;
DROP TABLE IF EXISTS `me_part`;
DROP TABLE IF EXISTS `module`;
DROP TABLE IF EXISTS `non_standard_material`;
DROP TABLE IF EXISTS `oscillator_crystal`;
DROP TABLE IF EXISTS `relay`;
DROP TABLE IF EXISTS `resistor`;
DROP TABLE IF EXISTS `thermistor`;
DROP TABLE IF EXISTS `transformer`;
DROP TABLE IF EXISTS `transistor`;
DROP TABLE IF EXISTS `varactor`;