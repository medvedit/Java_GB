package ru.medwedSA.Java_Core_GB.Lectures.Lecture_2;

/*
 *  Логирование
    Логи содержат системную информацию работы программного или аппаратного комплекса.
    В них записываются действия разного приоритета от пользователя, или программного продукта.
    Процесс ведения логов называют “логированием” (журналированием).

    Логирование. Использование
    Feb 14 1994 05:08:33 WATCHDOG: [FAUPGRADE][auto_firmware_check:(7285)]no need to upgrade firmware
    Feb 14 1994 07:03:41 ntp: start NTP update
    Feb 14 1994 10:14:02 syslog: wlceventd_proc_event(527): eth1: Auth BC:DD:C2:88:E2:3F, status: Successful (0), rssi:0
    Feb 14 1994 10:14:02 syslog: wlceventd_proc_event(556): eth1: Assoc BC:DD:C2:88:E2:3F, status: Successful (0), rssi:0
    Feb 14 1994 10:20:20 syslog: wlceventd_proc_event(527): eth1: Auth D4:A6:51:07:54:BB, status: Successful (0), rssi:0
    Feb 14 1994 10:20:20 syslog: wlceventd_proc_event(556): eth1: Assoc D4:A6:51:07:54:BB, status: Successful (0), rssi:0
    Feb 14 1994 10:20:20 syslog: wlceventd_proc_event(527): eth1: Auth D4:A6:51:01:F4:E9, status: Successful (0), rssi:0
    Feb 14 1994 10:20:20 syslog: wlceventd_proc_event(556): eth1: Assoc D4:A6:51:01:F4:E9, status: Successful (0), rssi:0
    Feb 14 1994 11:39:08 syslog: wlceventd_proc_event(491): eth1: Deauth_ind 48:3F:DA:91:19:E0, status: 0, reason: Disassociated due to inactivity (4), rssi:0 Feb 14 1994 13:03:06 syslog: wlceventd_proc_event(491): eth2: Deauth_ind 18:3E:EF:E9:DF:15, status: 0, reason: Disassociated due to inactivity (4), rssi:0 Feb 14 1994 13:03:08 syslog: wlceventd_proc_event(491): eth1: Deauth_ind BC:DD:C2:88:E2:3F, status: 0, reason: Disassociated due to inactivity (4), rssi:0 Feb 14 1994 13:03:19 syslog: wlceventd_proc_event(491): eth2: Deauth_ind C2:D4:93:FB:9F:FB, status: 0, reason: Disassociated due to inactivity (4), rssi:0 Feb 14 1994 13:03:31 syslog: wlceventd_proc_event(491): eth2: Deauth_ind FE:1F:80:6E:4B:09, status: 0, reason: Disassociated due to inactivity (4), rssi:0 Feb 14 1994 13:06:34 syslog: wlceventd_proc_event(491): eth1: Deauth_ind D4:A6:51:01:F4:E9, status: 0, reason: Disassociated due to inactivity (4), rssi:0 Feb 14 1994 13:06:34 syslog: wlceventd_proc_event(491): eth1: Deauth_ind D4:A6:51:07:54:BB, status: 0, reason: Disassociated due to inactivity (4), rssi:0 Feb 14 1994 18:07:09 syslog: wlceventd_proc_event(527): eth1: Auth 72:34:C1:43:EC:16, status: Successful (0), rssi:0
    Feb 14 1994 18:07:09 syslog: wlceventd_proc_event(527): eth1: Auth 72:34:C1:43:EC:16, status: Successful (0), rssi:0
    Feb 14 1994 18:07:09 syslog: wlceventd_proc_event(556): eth1: Assoc 72:34:C1:43:EC:16, status: Successful (0), rssi:0
    Feb 14 1994 18:07:23 syslog: wlceventd_proc_event(527): eth1: Auth FA:7F:A4:CD:2F:4B, status: Successful (0), rssi:0
    Feb 14 1994 18:07:23 syslog: wlceventd_proc_event(556): eth1: Assoc FA:7F:A4:CD:2F:4B, status: Successful (0), rssi:0
    Feb 14 1994 18:08:10 syslog: wlceventd_proc_event(527): eth1: Auth 84:CC:A8:86:02:33, status: Successful (0), rssi:0
    Feb 14 1994 18:08:10 syslog: wlceventd_proc_event(556): eth1: Assoc 84:CC:A8:86:02:33, status: Successful (0), rssi:0
    Feb 14 1994 18:08:15 syslog: wlceventd_proc_event(527): eth1: Auth BC:DD:C2:88:E2:3F, status: Successful (0), rssi:0
    Feb 14 1994 18:08:15 syslog: wlceventd_proc_event(556): eth1: Assoc BC:DD:C2:88:E2:3F, status: Successful (0), rssi:0
    Feb 14 1994 18:09:14 syslog: wlceventd_proc_event(527): eth2: Auth 18:3E:EF:E9:DF:15, status: Successful (0), rssi:0
    Feb 14 1994 18:09:14 syslog: wlceventd_proc_event(556): eth2: Assoc 18:3E:EF:E9:DF:15, status: Successful (0), rssi:0

     Логирование. Использование. Основы

    Использование
    Logger logger = Logger.getLogger(<указать тип, наименование класса>)

    Уровни важности
    INFO, DEBUG, ERROR, WARNING и др.

    Вывод
    ConsoleHandler info = new ConsoleHandler(); log.addHandler(info);

    Формат вывода: структурированный, абы как*
    XMLFormatter, SimpleFormatter
 */

import java.io.IOException;
import java.util.logging.*;


public class IoggingFile {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(IoggingFile.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
         FileHandler fh = new FileHandler("/Users/Medwed_SA/Desktop/Education/" +
                 "Java/project_IntelliJ_IDEA/Java_GB/src/main/java/ru/medwedSA/" +
                 "Java_Core_GB/Lectures/Lecture_2/log.xml");
//        logger.addHandler(ch);
         logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
         XMLFormatter xml = new XMLFormatter();
//        ch.setFormatter(sFormat);
         fh.setFormatter(xml);

//        logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}