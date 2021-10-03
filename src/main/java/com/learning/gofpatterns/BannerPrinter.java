package com.learning.gofpatterns;

public class BannerPrinter {

    public static void printAbstractFactoryBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                                                                                                                                               |
            |    .s5SSSs.                                                                            .s5SSSs.                                                               |
            |          SS. .s5SSSs.  .s5SSSs.  .s5SSSSs. .s5SSSs.  .s5SSSs.  .s5SSSs.  .s5SSSSs.              .s5SSSs.  .s5SSSs.  .s5SSSSs. .s5SSSs.  .s5SSSs.  .s5 s.      |
            |    sS    S%S       SS.       SS.    SSS          SS.       SS.       SS.    SSS        sS             SS.       SS.    SSS          SS.       SS.     SS.     |
            |    SS    S%S sS    S%S sS    `:;    S%S    sS    S%S sS    S%S sS    `:;    S%S        SS       sS    S%S sS    `:;    S%S    sS    S%S sS    S%S ssS SSS     |
            |    SSSs. S%S SS .sSSS  `:;;;;.      S%S    SS .sS;:' SSSs. S%S SS           S%S        SSSs.    SSSs. S%S SS           S%S    SS    S%S SS .sS;:'  SSSSS      |
            |    SS    S%S SS    S%S       ;;.    S%S    SS    ;,  SS    S%S SS           S%S        SS       SS    S%S SS           S%S    SS    S%S SS    ;,    SSS       |
            |    SS    `:; SS    `:;       `:;    `:;    SS    `:; SS    `:; SS           `:;        SS       SS    `:; SS           `:;    SS    `:; SS    `:;   `:;       |
            |    SS    ;,. SS    ;,. .,;   ;,.    ;,.    SS    ;,. SS    ;,. SS    ;,.    ;,.        SS       SS    ;,. SS    ;,.    ;,.    SS    ;,. SS    ;,.   ;,.       |
            |    :;    ;:' `:;;;;;:' `:;;;;;:'    ;:'    `:    ;:' :;    ;:' `:;;;;;:'    ;:'        :;       :;    ;:' `:;;;;;:'    ;:'    `:;;;;;:' `:    ;:'   ;:'       |
            |                                                                                                                                                               |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printAdapterBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |          __       ________       __         _______  ___________  _______   _______         |
            |         /""\\     |"      "\\     /""\\       |   __ "\\("     _   ")/"     "| /"      \\        |
            |        /    \\    (.  ___  :)   /    \\      (. |__) :))__/  \\\\__/(: ______)|:        |       |
            |       /' /\\  \\   |: \\   ) ||  /' /\\  \\     |:  ____/    \\\\_ /    \\/    |  |_____/   )       |
            |      //  __'  \\  (| (___\\ || //  __'  \\    (|  /        |.  |    // ___)_  //      /        |
            |     /   /  \\\\  \\ |:       :)/   /  \\\\  \\  /|__/ \\       \\:  |   (:      "||:  __   \\        |
            |    (___/    \\___)(________/(___/    \\___)(_______)       \\__|    \\_______)|__|  \\___)       |
            |                                                                                             |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printBridgeBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                                                 |
            |   @@@@@@@    @@@@@@@    @@@   @@@@@@@     @@@@@@@    @@@@@@@@   |
            |   @@!  @@@   @@!  @@@   @@!   @@!  @@@   !@@         @@!        |
            |   @!@!@!@    @!@!!@!    !!@   @!@  !@!   !@! @!@!@   @!!!:!     |
            |   !!:  !!!   !!: :!!    !!:   !!:  !!!   :!!   !!:   !!:        |
            |   :: : ::     :   : :    :    :: :  :     :: :: :    : :: :::   |
            |                                                                 |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printBuilderBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                                                                     |
            |    :::::::::  :::    ::: ::::::::::: :::        :::::::::  :::::::::: :::::::::     |
            |    :+:    :+: :+:    :+:     :+:     :+:        :+:    :+: :+:        :+:    :+:    |
            |    +:+    +:+ +:+    +:+     +:+     +:+        +:+    +:+ +:+        +:+    +:+    |
            |    +#++:++#+  +#+    +:+     +#+     +#+        +#+    +:+ +#++:++#   +#++:++#:     |
            |    +#+    +#+ +#+    +#+     +#+     +#+        +#+    +#+ +#+        +#+    +#+    |
            |    #+#    #+# #+#    #+#     #+#     #+#        #+#    #+# #+#        #+#    #+#    |
            |    #########   ########  ########### ########## #########  ########## ###    ###    |
            |                                                                                     |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }
    public static void printChainOfResponsibilityBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            |                                                                                                                                                                                                            |
            |           oooo                   o8o                              .o88o.                                                                             o8o   .o8        o8o  oooo   o8o      .               |
            |           `888                   `"'                              888 `"                                                                             `"'  "888        `"'  `888   `"'    .o8               |
            |  .ooooo.   888 .oo.    .oooo.   oooo  ooo. .oo.         .ooooo.  o888oo       oooo d8b  .ooooo.   .oooo.o oo.ooooo.   .ooooo.  ooo. .oo.    .oooo.o oooo   888oooo.  oooo   888  oooo  .o888oo oooo    ooo |
            | d88' `"Y8  888P"Y88b  `P  )88b  `888  `888P"Y88b       d88' `88b  888         `888""8P d88' `88b d88(  "8  888' `88b d88' `88b `888P"Y88b  d88(  "8 `888   d88' `88b `888   888  `888    888    `88.  .8'  |
            | 888        888   888   .oP"888   888   888   888       888   888  888          888     888ooo888 `"Y88b.   888   888 888   888  888   888  `"Y88b.   888   888   888  888   888   888    888     `88..8'   |
            | 888   .o8  888   888  d8(  888   888   888   888       888   888  888          888     888    .o o.  )88b  888   888 888   888  888   888  o.  )88b  888   888   888  888   888   888    888 .    `888'    |
            | `Y8bod8P' o888o o888o `Y888""8o o888o o888o o888o      `Y8bod8P' o888o        d888b    `Y8bod8P' 8""888P'  888bod8P' `Y8bod8P' o888o o888o 8""888P' o888o  `Y8bod8P' o888o o888o o888o   "888"     .8'     |
            |                                                                                                            888                                                                                 .o..P'      |
            |                                                                                                           o888o                                                                                `Y8P'       |
            |                                                                                                                                                                                                            |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            """);
    }

    public static void printCommandBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                                                             |
            |      .aMMMb   .aMMMb   dMMMMMMMMb   dMMMMMMMMb   .aMMMb   dMMMMb   dMMMMb   |
            |     dMP"VMP  dMP"dMP  dMP"dMP"dMP  dMP"dMP"dMP  dMP"dMP  dMP dMP  dMP VMP   |
            |    dMP      dMP dMP  dMP dMP dMP  dMP dMP dMP  dMMMMMP  dMP dMP  dMP dMP    |
            |   dMP.aMP  dMP.aMP  dMP dMP dMP  dMP dMP dMP  dMP dMP  dMP dMP  dMP.aMP     |
            |   VMMMP"   VMMMP"  dMP dMP dMP  dMP dMP dMP  dMP dMP  dMP dMP  dMMMMP"      |
            |                                                                             |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printCompositeBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                                                                   |
            |                                                              d8b 888              |
            |                                                              Y8P 888              |
            |                                                                  888              |
            |     .d8888b .d88b.  88888b.d88b.  88888b.   .d88b.  .d8888b  888 888888 .d88b.    |
            |    d88P"   d88""88b 888 "888 "88b 888 "88b d88""88b 88K      888 888   d8P  Y8b   |
            |    888     888  888 888  888  888 888  888 888  888 "Y8888b. 888 888   88888888   |
            |    Y88b.   Y88..88P 888  888  888 888 d88P Y88..88P      X88 888 Y88b. Y8b.       |
            |     "Y8888P "Y88P"  888  888  888 88888P"   "Y88P"   88888P' 888  "Y888 "Y8888    |
            |                                   888                                             |
            |                                   888                                             |
            |                                   888                                             |
            |                                                                                   |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printDecoratorBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                                                               |
            |       dBBBBb  dBBBP  dBBBP  dBBBBP dBBBBBb dBBBBBb  dBBBBBBP dBBBBP dBBBBBb   |
            |         dBP               dBP.BP      dBP      BB          dBP.BP      dBP    |
            |    dBP dBP dBBP   dBP    dBP.BP   dBBBBK   dBP BB   dBP   dBP.BP   dBBBBK     |
            |   dBP dBP dBP    dBP    dBP.BP   dBP  BB  dBP  BB  dBP   dBP.BP   dBP  BB     |
            |  dBBBBBP dBBBBP dBBBBP dBBBBP   dBP  dB' dBBBBBBB dBP   dBBBBP   dBP  dB'     |
            |                                                                               |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printFacadeBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                                                                                                         |
            |                                                                                          dddddddd                       |
            |        ffffffffffffffff                                                                  d::::::d                       |
            |       f::::::::::::::::f                                                                 d::::::d                       |
            |      f::::::::::::::::::f                                                                d::::::d                       |
            |      f::::::fffffff:::::f                                                                d:::::d                        |
            |      f:::::f       ffffffaaaaaaaaaaaaa      cccccccccccccccc  aaaaaaaaaaaaa      ddddddddd:::::d     eeeeeeeeeeee       |
            |      f:::::f             a::::::::::::a   cc:::::::::::::::c  a::::::::::::a   dd::::::::::::::d   ee::::::::::::ee     |
            |     f:::::::ffffff       aaaaaaaaa:::::a c:::::::::::::::::c  aaaaaaaaa:::::a d::::::::::::::::d  e::::::eeeee:::::ee   |
            |     f::::::::::::f                a::::ac:::::::cccccc:::::c           a::::ad:::::::ddddd:::::d e::::::e     e:::::e   |
            |     f::::::::::::f         aaaaaaa:::::ac::::::c     ccccccc    aaaaaaa:::::ad::::::d    d:::::d e:::::::eeeee::::::e   |
            |     f:::::::ffffff       aa::::::::::::ac:::::c               aa::::::::::::ad:::::d     d:::::d e:::::::::::::::::e    |
            |      f:::::f            a::::aaaa::::::ac:::::c              a::::aaaa::::::ad:::::d     d:::::d e::::::eeeeeeeeeee     |
            |      f:::::f           a::::a    a:::::ac::::::c     ccccccca::::a    a:::::ad:::::d     d:::::d e:::::::e              |
            |     f:::::::f          a::::a    a:::::ac:::::::cccccc:::::ca::::a    a:::::ad::::::ddddd::::::dde::::::::e             |
            |     f:::::::f          a:::::aaaa::::::a c:::::::::::::::::ca:::::aaaa::::::a d:::::::::::::::::d e::::::::eeeeeeee     |
            |     f:::::::f           a::::::::::aa:::a cc:::::::::::::::c a::::::::::aa:::a d:::::::::ddd::::d  ee:::::::::::::e     |
            |     fffffffff            aaaaaaaaaa  aaaa   cccccccccccccccc  aaaaaaaaaa  aaaa  ddddddddd   ddddd    eeeeeeeeeeeeee     |
            |                                                                                                                         |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printFactoryMethodBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                                                                     |
            |      sSSs   .S_SSSs      sSSs  sdSS_SSSSSSbs    sSSs_sSSs     .S_sSSs     .S S.     |
            |     d%%SP  .SS~SSSSS    d%%SP  YSSS~S%SSSSSP   d%%SP~YS%%b   .SS~YS%%b   .SS SS.    |
            |    d%S'    S%S   SSSS  d%S'         S%S       d%S'     `S%b  S%S   `S%b  S%S S%S    |
            |    S%S     S%S    S%S  S%S          S%S       S%S       S%S  S%S    S%S  S%S S%S    |
            |    S&S     S%S SSSS%S  S&S          S&S       S&S       S&S  S%S    d*S  S%S S%S    |
            |    S&S_Ss  S&S  SSS%S  S&S          S&S       S&S       S&S  S&S   .S*S   SS SS     |
            |    S&S~SP  S&S    S&S  S&S          S&S       S&S       S&S  S&S_sdSSS     S S      |
            |    S&S     S&S    S&S  S&S          S&S       S&S       S&S  S&S~YSY%b     SSS      |
            |    S*b     S*S    S&S  S*b          S*S       S*b       d*S  S*S   `S%b    S*S      |
            |    S*S     S*S    S*S  S*S.         S*S       S*S.     .S*S  S*S    S%S    S*S      |
            |    S*S     S*S    S*S   SSSbs       S*S        SSSbs_sdSSS   S*S    S&S    S*S      |
            |    S*S     SSS    S*S    YSSP       S*S         YSSP~YSSY    S*S    SSS    S*S      |
            |    SP             SP                SP                       SP            SP       |
            |    Y              Y                 Y                        Y             Y        |
            |                                                                                     |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printFlyweightBanner() {
        System.out.println("""
           -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
           |                                                                                             |
           |    .s5SSSs.                                                                                 |
           |             .s        .s5 s.   .s s.  s.   .s5SSSs.   s.   .s5SSSs.   .s    s.  .s5SSSSs.   |
           |    sS                     SS.     SS. SS.        SS.  SS.        SS.        SS.    SSS      |
           |    SS       sS        ssS SSS  sS S%S S%S  sS    `:;  S%S  sS    `:;  sS    S%S    S%S      |
           |    SSSs.    SS         SSSSS   SS S%S S%S  SSSs.      S%S  SS         SSSs. S%S    S%S      |
           |    SS       SS          SSS    SS S%S S%S  SS         S%S  SS         SS    S%S    S%S      |
           |    SS       SS          `:;    SS `:; `:;  SS         `:;  SS   ``:;  SS    `:;    `:;      |
           |    SS       SS    ;,.   ;,.    SS ;,. ;,.  SS    ;,.  ;,.  SS    ;,.  SS    ;,.    ;,.      |
           |    :;       `:;;;;;:'   ;:'    `:;;:'`::'  `:;;;;;:'  ;:'  `:;;;;;:'  :;    ;:'    ;:'      |
           |                                                                                             |
           -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
           """);
    }

    public static void printIteratorBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                                                         |
            |     ██▓▄▄▄█████▓▓█████  ██▀███   ▄▄▄     ▄▄▄█████▓ ▒█████   ██▀███      |
            |    ▓██▒▓  ██▒ ▓▒▓█   ▀ ▓██ ▒ ██▒▒████▄   ▓  ██▒ ▓▒▒██▒  ██▒▓██ ▒ ██▒    |
            |    ▒██▒▒ ▓██░ ▒░▒███   ▓██ ░▄█ ▒▒██  ▀█▄ ▒ ▓██░ ▒░▒██░  ██▒▓██ ░▄█ ▒    |
            |    ░██░░ ▓██▓ ░ ▒▓█  ▄ ▒██▀▀█▄  ░██▄▄▄▄██░ ▓██▓ ░ ▒██   ██░▒██▀▀█▄      |
            |    ░██░  ▒██▒ ░ ░▒████▒░██▓ ▒██▒ ▓█   ▓██▒ ▒██▒ ░ ░ ████▓▒░░██▓ ▒██▒    |
            |    ░▓    ▒ ░░   ░░ ▒░ ░░ ▒▓ ░▒▓░ ▒▒   ▓▒█░ ▒ ░░   ░ ▒░▒░▒░ ░ ▒▓ ░▒▓░    |
            |     ▒ ░    ░     ░ ░  ░  ░▒ ░ ▒░  ▒   ▒▒ ░   ░      ░ ▒ ▒░   ░▒ ░ ▒░    |
            |     ▒ ░  ░         ░     ░░   ░   ░   ▒    ░      ░ ░ ░ ▒    ░░   ░     |
            |     ░              ░  ░   ░           ░  ░            ░ ░     ░         |
            |                                                                         |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printMediatorBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            |                                                                                                                  |
            |   .sSSSsSS SSsSSSSS  .sSSSSs.     .sSSSSs.     SSSSS  .sSSSSs.     .sSSSSSSSSSSSSSs.  .sSSSSs.     .sSSSSSSSs.   |
            |   S SSS  SSS  SSSSS  S SSSSSSSs.  S SSSSSSSs.  S SSS  S SSSSSSSs.  SSSSS S SSS SSSSS  S SSSSSSSs.  S SSS SSSSS   |
            |   S  SS   S   SSSSS  S  SS SSSS'  S  SS SSSSS  S  SS  S  SS SSSSS  SSSSS S  SS SSSSS  S  SS SSSSS  S  SS SSSS'   |
            |   S..SS       SSSSS  S..SS        S..SS SSSSS  S..SS  S..SSsSSSSS  `:S:' S..SS `:S:'  S..SS SSSSS  S..SSsSSSa.   |
            |   S:::S       SSSSS  S:::SSSS     S:::S SSSSS  S:::S  S:::S SSSSS        S:::S        S:::S SSSSS  S:::S SSSSS   |
            |   S;;;S       SSSSS  S;;;S        S;;;S SSSSS  S;;;S  S;;;S SSSSS        S;;;S        S;;;S SSSSS  S;;;S SSSSS   |
            |   S%%%S       SSSSS  S%%%S SSSSS  S%%%S SSSS'  S%%%S  S%%%S SSSSS        S%%%S        S%%%S SSSSS  S%%%S SSSSS   |
            |   SSSSS       SSSSS  SSSSSsSS;:'  SSSSSsS;:'   SSSSS  SSSSS SSSSS        SSSSS        SSSSSsSSSSS  SSSSS SSSSS   |
            |                                                                                                                  |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            """);
    }

    public static void printMementoBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=
            |                                                                      #                |
            |                                                                     ##                |
            |                                                                     ##                |
            |   ### /### /###      /##   ### /### /###      /##   ###  /###     ########  /###      |
            |    ##/ ###/ /##  /  / ###   ##/ ###/ /##  /  / ###   ###/ #### / ########  / ###      |
            |     ##  ###/ ###/  /   ###   ##  ###/ ###/  /   ###   ##   ###/     ##    /   ###     |
            |     ##   ##   ##  ##    ###  ##   ##   ##  ##    ###  ##    ##      ##   ##    ##     |
            |     ##   ##   ##  ########   ##   ##   ##  ########   ##    ##      ##   ##    ##     |
            |     ##   ##   ##  #######    ##   ##   ##  #######    ##    ##      ##   ##    ##     |
            |     ##   ##   ##  ##         ##   ##   ##  ##         ##    ##      ##   ##    ##     |
            |     ##   ##   ##  ####    /  ##   ##   ##  ####    /  ##    ##      ##   ##    ##     |
            |     ###  ###  ###  ######/   ###  ###  ###  ######/   ###   ###     ##    ######      |
            |      ###  ###  ###  #####     ###  ###  ###  #####     ###   ###     ##    ####       |
            |                                                                                       |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=
            """);
    }

    public static void printObserverBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |=====================================================================|
            |==========  =========================================================|
            |==========  =========================================================|
            |==========  =========================================================|
            |===   ====  =======   =====   ====  =   ====  =  ====   ====  =   ===|
            |==     ===    ====  =  ===  =  ===    =  ===  =  ===  =  ===    =  ==|
            |==  =  ===  =  ====  =====     ===  =========   ====     ===  =======|
            |==  =  ===  =  =====  ====  ======  =========   ====  ======  =======|
            |==  =  ===  =  ===  =  ===  =  ===  ========== =====  =  ===  =======|
            |===   ====    =====   =====   ====  ========== ======   ====  =======|
            |=====================================================================|
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printPrototypeBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            |                                                                                                      |
            |   '########::'########:::'#######::'########::'#######::'########:'##:::'##:'########::'########:    |
            |    ##.... ##: ##.... ##:'##.... ##:... ##..::'##.... ##:... ##..::. ##:'##:: ##.... ##: ##.....::    |
            |    ##:::: ##: ##:::: ##: ##:::: ##:::: ##:::: ##:::: ##:::: ##:::::. ####::: ##:::: ##: ##:::::::    |
            |    ########:: ########:: ##:::: ##:::: ##:::: ##:::: ##:::: ##::::::. ##:::: ########:: ######:::    |
            |    ##.....::: ##.. ##::: ##:::: ##:::: ##:::: ##:::: ##:::: ##::::::: ##:::: ##.....::: ##...::::    |
            |    ##:::::::: ##::. ##:: ##:::: ##:::: ##:::: ##:::: ##:::: ##::::::: ##:::: ##:::::::: ##:::::::    |
            |    ##:::::::: ##:::. ##:. #######::::: ##::::. #######::::: ##::::::: ##:::: ##:::::::: ########:    |
            |   ..:::::::::..:::::..:::.......::::::..::::::.......::::::..::::::::..:::::..:::::::::........::    |
            |                                                                                                      |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            """);
    }
    public static void printProxyBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                                                   |
            |   8b,dPPYba,   8b,dPPYba,   ,adPPYba,  8b,     ,d8  8b       d8   |
            |   88P'    "8a  88P'   "Y8  a8"     "8a  `Y8, ,8P'   `8b     d8'   |
            |   88       d8  88          8b       d8    )888(      `8b   d8'    |
            |   88b,   ,a8"  88          "8a,   ,a8"  ,d8" "8b,     `8b,d8'     |
            |   88`YbbdP"'   88           `"YbbdP"'  8P'     `Y8      Y88'      |
            |   88                                                    d8'       |
            |   88                                                   d8'        |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printSingletonBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                                                                           |
            |      █████████   ███                      ████            █████                           |
            |     ███░░░░░███ ░░░                      ░░███           ░░███                            |
            |    ░███    ░░░  ████  ████████    ███████ ░███   ██████  ███████    ██████  ████████      |
            |    ░░█████████ ░░███ ░░███░░███  ███░░███ ░███  ███░░███░░░███░    ███░░███░░███░░███     |
            |     ░░░░░░░░███ ░███  ░███ ░███ ░███ ░███ ░███ ░███████   ░███    ░███ ░███ ░███ ░███     |
            |     ███    ░███ ░███  ░███ ░███ ░███ ░███ ░███ ░███░░░    ░███ ███░███ ░███ ░███ ░███     |
            |    ░░█████████  █████ ████ █████░░███████ █████░░██████   ░░█████ ░░██████  ████ █████    |
            |     ░░░░░░░░░  ░░░░░ ░░░░ ░░░░░  ░░░░░███░░░░░  ░░░░░░     ░░░░░   ░░░░░░  ░░░░ ░░░░░     |
            |                                  ███ ░███                                                 |
            |                                 ░░██████                                                  |
            |                                  ░░░░░░                                                   |
            |                                                                                           |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printStateBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                 /$$                   /$$                   |
            |                | $$                  | $$                   |
            |     /$$$$$$$  /$$$$$$     /$$$$$$   /$$$$$$     /$$$$$$     |
            |    /$$_____/ |_  $$_/    |____  $$ |_  $$_/    /$$__  $$    |
            |   |  $$$$$$    | $$       /$$$$$$$   | $$     | $$$$$$$$    |
            |    \\____  $$   | $$ /$$  /$$__  $$   | $$ /$$ | $$_____/    |
            |    /$$$$$$$/   |  $$$$/ |  $$$$$$$   |  $$$$/ |  $$$$$$$    |
            |   |_______/     \\___/    \\_______/    \\___/    \\_______/    |
            |                                                             |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printStrategyBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            |                                               |
            |        _             _                        |
            |       | |           | |                       |
            |    ___| |_ _ __ __ _| |_ ___  __ _ _   _      |
            |   / __| __| '__/ _` | __/ _ \\/ _` | | | |     |
            |   \\__ \\ |_| | | (_| | ||  __/ (_| | |_| |     |
            |   |___/\\__|_|  \\__,_|\\__\\___|\\__, |\\__, |     |
            |                               __/ | __/ |     |
            |                              |___/ |___/      |
            |                                               |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printTemplateMethod() {
        System.out.println("""
           -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
           |                                                                                                                                                                         ;             |
           |                                                                                                                                                                  :      ED.           |
           |                   ,;                                                                            ,;                                    ,;                        t#,     E#Wi          |
           |                 f#i                      t                   i                                f#i                                   f#i          .    .        ;##W.    E###G.        |
           |  GEEEEEEEL    .E#t            ..       : ED.                LE              .. GEEEEEEEL    .E#t                   ..       :     .E#t  GEEEEEEELDi   Dt      :#L:WE    E#fD#W;       |
           |  ,;;L#K;;.   i#W,            ,W,     .Et E#K:              L#E             ;W, ,;;L#K;;.   i#W,                   ,W,     .Et    i#W,   ,;;L#K;;.E#i  E#i    .KG  ,#D   E#t t##L      |
           |     t#E     L#D.            t##,    ,W#t E##W;            G#W.            j##,    t#E     L#D.                   t##,    ,W#t   L#D.       t#E   E#t  E#t    EE    ;#f  E#t  .E#K,    |
           |     t#E   :K#Wfff;         L###,   j###t E#E##t          D#K.            G###,    t#E   :K#Wfff;                L###,   j###t :K#Wfff;     t#E   E#t  E#t   f#.     t#i E#t    j##f   |
           |     t#E   i##WLLLLt      .E#j##,  G#fE#t E#ti##f        E#K.           :E####,    t#E   i##WLLLLt             .E#j##,  G#fE#t i##WLLLLt    t#E   E########f.:#G     GK  E#t    :E#K:  |
           |     t#E    .E#L         ;WW; ##,:K#i E#t E#t ;##D.    .E#E.           ;W#DG##,    t#E    .E#L                ;WW; ##,:K#i E#t  .E#L        t#E   E#j..K#j... ;#L   LW.  E#t   t##L    |
           |     t#E      f#E:      j#E.  ##f#W,  E#t E#ELLE##K:  .K#E            j###DW##,    t#E      f#E:             j#E.  ##f#W,  E#t    f#E:      t#E   E#t  E#t     t#f f#:   E#t .D#W;     |
           |     t#E       ,WW;   .D#L    ###K:   E#t E#L;;;;;;, .K#D            G##i,,G##,    t#E       ,WW;          .D#L    ###K:   E#t     ,WW;     t#E   E#t  E#t      f#D#;    E#tiW#G.      |
           |     t#E        .D#; :K#t     ##D.    E#t E#t       .W#G           :K#K:   L##,    t#E        .D#;        :K#t     ##D.    E#t      .D#;    t#E   f#t  f#t       G#t     E#K##i        |
           |      fE          tt ...      #G      ..  E#t      :W##########Wt ;##D.    L##,     fE          tt        ...      #G      ..         tt     fE    ii   ii        t      E##D.         |
           |       :                      j                    :,,,,,,,,,,,,,.,,,      .,,       :                             j                          :                          E#t           |
           |                                                                                                                                                                         L:            |
           -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
            """);
    }

    public static void printVisitorBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            |   ,---.  ,---..-./`)    .-'''-. .-./`) ,---------.    ,-----.    .-------.       |
            |   |   /  |   |\\ .-.')  / _     \\\\ .-.')\\          \\ .'  .-,  '.  |  _ _   \\      |
            |   |  |   |  .'/ `-' \\ (`' )/`--'/ `-' \\ `--.  ,---'/ ,-.|  \\ _ \\ | ( ' )  |      |
            |   |  | _ |  |  `-'`"`(_ o _).    `-'`"`    |   \\  ;  \\  '_ /  | :|(_ o _) /      |
            |   |  _( )_  |  .---.  (_,_). '.  .---.     :_ _:  |  _`,/ \\ _/  || (_,_).' __    |
            |   \\ (_ o._) /  |   | .---.  \\  : |   |     (_I_)  : (  '\\_/ \\   ;|  |\\ \\  |  |   |
            |    \\ (_,_) /   |   | \\    `-'  | |   |    (_(=)_)  \\ `"/  \\  ) / |  | \\ `'   /   |
            |     \\     /    |   |  \\       /  |   |     (_I_)    '. \\_/``".'  |  |  \\    /    |
            |      `---`     '---'   `-...-'   '---'     '---'      '-----'    ''-'   `'-'     |
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            """);
    }



}
