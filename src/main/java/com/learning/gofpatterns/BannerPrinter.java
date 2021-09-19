package com.learning.gofpatterns;

public class BannerPrinter {

    public static void printAbstractFactoryBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |                                                                                                                                                               |\s
            |    .s5SSSs.                                                                            .s5SSSs.                                                               |\s
            |          SS. .s5SSSs.  .s5SSSs.  .s5SSSSs. .s5SSSs.  .s5SSSs.  .s5SSSs.  .s5SSSSs.              .s5SSSs.  .s5SSSs.  .s5SSSSs. .s5SSSs.  .s5SSSs.  .s5 s.      |\s
            |    sS    S%S       SS.       SS.    SSS          SS.       SS.       SS.    SSS        sS             SS.       SS.    SSS          SS.       SS.     SS.     |\s
            |    SS    S%S sS    S%S sS    `:;    S%S    sS    S%S sS    S%S sS    `:;    S%S        SS       sS    S%S sS    `:;    S%S    sS    S%S sS    S%S ssS SSS     |\s
            |    SSSs. S%S SS .sSSS  `:;;;;.      S%S    SS .sS;:' SSSs. S%S SS           S%S        SSSs.    SSSs. S%S SS           S%S    SS    S%S SS .sS;:'  SSSSS      |\s
            |    SS    S%S SS    S%S       ;;.    S%S    SS    ;,  SS    S%S SS           S%S        SS       SS    S%S SS           S%S    SS    S%S SS    ;,    SSS       |\s
            |    SS    `:; SS    `:;       `:;    `:;    SS    `:; SS    `:; SS           `:;        SS       SS    `:; SS           `:;    SS    `:; SS    `:;   `:;       |\s
            |    SS    ;,. SS    ;,. .,;   ;,.    ;,.    SS    ;,. SS    ;,. SS    ;,.    ;,.        SS       SS    ;,. SS    ;,.    ;,.    SS    ;,. SS    ;,.   ;,.       |\s
            |    :;    ;:' `:;;;;;:' `:;;;;;:'    ;:'    `:    ;:' :;    ;:' `:;;;;;:'    ;:'        :;       :;    ;:' `:;;;;;:'    ;:'    `:;;;;;:' `:    ;:'   ;:'       |\s
            |                                                                                                                                                               |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }

    public static void printAdapterBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |          __       ________       __         _______  ___________  _______   _______         |\s
            |         /""\\     |"      "\\     /""\\       |   __ "\\("     _   ")/"     "| /"      \\        |\s
            |        /    \\    (.  ___  :)   /    \\      (. |__) :))__/  \\\\__/(: ______)|:        |       |\s
            |       /' /\\  \\   |: \\   ) ||  /' /\\  \\     |:  ____/    \\\\_ /    \\/    |  |_____/   )       |\s
            |      //  __'  \\  (| (___\\ || //  __'  \\    (|  /        |.  |    // ___)_  //      /        |\s
            |     /   /  \\\\  \\ |:       :)/   /  \\\\  \\  /|__/ \\       \\:  |   (:      "||:  __   \\        |\s
            |    (___/    \\___)(________/(___/    \\___)(_______)       \\__|    \\_______)|__|  \\___)       |\s
            |                                                                                             |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }

    public static void printBridgeBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |                                                                 |\s
            |   @@@@@@@    @@@@@@@    @@@   @@@@@@@     @@@@@@@    @@@@@@@@   |
            |   @@!  @@@   @@!  @@@   @@!   @@!  @@@   !@@         @@!        |\s
            |   @!@!@!@    @!@!!@!    !!@   @!@  !@!   !@! @!@!@   @!!!:!     |\s
            |   !!:  !!!   !!: :!!    !!:   !!:  !!!   :!!   !!:   !!:        |\s
            |   :: : ::     :   : :    :    :: :  :     :: :: :    : :: :::   |
            |                                                                 |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }

    public static void printBuilderBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |                                                                                     |\s
            |    :::::::::  :::    ::: ::::::::::: :::        :::::::::  :::::::::: :::::::::     |\s
            |    :+:    :+: :+:    :+:     :+:     :+:        :+:    :+: :+:        :+:    :+:    |\s
            |    +:+    +:+ +:+    +:+     +:+     +:+        +:+    +:+ +:+        +:+    +:+    |\s
            |    +#++:++#+  +#+    +:+     +#+     +#+        +#+    +:+ +#++:++#   +#++:++#:     |\s
            |    +#+    +#+ +#+    +#+     +#+     +#+        +#+    +#+ +#+        +#+    +#+    |\s
            |    #+#    #+# #+#    #+#     #+#     #+#        #+#    #+# #+#        #+#    #+#    |\s
            |    #########   ########  ########### ########## #########  ########## ###    ###    |\s
            |                                                                                     |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }
    public static void printChainOfResponsibilityBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\s
            |                                                                                                                                                                                                            |\s
            |           oooo                   o8o                              .o88o.                                                                             o8o   .o8        o8o  oooo   o8o      .               |\s
            |           `888                   `"'                              888 `"                                                                             `"'  "888        `"'  `888   `"'    .o8               |\s
            |  .ooooo.   888 .oo.    .oooo.   oooo  ooo. .oo.         .ooooo.  o888oo       oooo d8b  .ooooo.   .oooo.o oo.ooooo.   .ooooo.  ooo. .oo.    .oooo.o oooo   888oooo.  oooo   888  oooo  .o888oo oooo    ooo |\s
            | d88' `"Y8  888P"Y88b  `P  )88b  `888  `888P"Y88b       d88' `88b  888         `888""8P d88' `88b d88(  "8  888' `88b d88' `88b `888P"Y88b  d88(  "8 `888   d88' `88b `888   888  `888    888    `88.  .8'  |\s
            | 888        888   888   .oP"888   888   888   888       888   888  888          888     888ooo888 `"Y88b.   888   888 888   888  888   888  `"Y88b.   888   888   888  888   888   888    888     `88..8'   |\s
            | 888   .o8  888   888  d8(  888   888   888   888       888   888  888          888     888    .o o.  )88b  888   888 888   888  888   888  o.  )88b  888   888   888  888   888   888    888 .    `888'    |\s
            | `Y8bod8P' o888o o888o `Y888""8o o888o o888o o888o      `Y8bod8P' o888o        d888b    `Y8bod8P' 8""888P'  888bod8P' `Y8bod8P' o888o o888o 8""888P' o888o  `Y8bod8P' o888o o888o o888o   "888"     .8'     |\s
            |                                                                                                            888                                                                                 .o..P'      |\s
            |                                                                                                           o888o                                                                                `Y8P'       |\s
            |                                                                                                                                                                                                            |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\s
            """);
    }

    public static void printCommandBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |                                                                             |\s
            |      .aMMMb   .aMMMb   dMMMMMMMMb   dMMMMMMMMb   .aMMMb   dMMMMb   dMMMMb   |\s
            |     dMP"VMP  dMP"dMP  dMP"dMP"dMP  dMP"dMP"dMP  dMP"dMP  dMP dMP  dMP VMP   |\s
            |    dMP      dMP dMP  dMP dMP dMP  dMP dMP dMP  dMMMMMP  dMP dMP  dMP dMP    |\s
            |   dMP.aMP  dMP.aMP  dMP dMP dMP  dMP dMP dMP  dMP dMP  dMP dMP  dMP.aMP     |\s
            |   VMMMP"   VMMMP"  dMP dMP dMP  dMP dMP dMP  dMP dMP  dMP dMP  dMMMMP"      |\s
            |                                                                             |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }

    public static void printCompositeBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |                                                                                   |\s
            |                                                              d8b 888              |\s
            |                                                              Y8P 888              |\s
            |                                                                  888              |\s
            |     .d8888b .d88b.  88888b.d88b.  88888b.   .d88b.  .d8888b  888 888888 .d88b.    |\s
            |    d88P"   d88""88b 888 "888 "88b 888 "88b d88""88b 88K      888 888   d8P  Y8b   |\s
            |    888     888  888 888  888  888 888  888 888  888 "Y8888b. 888 888   88888888   |\s
            |    Y88b.   Y88..88P 888  888  888 888 d88P Y88..88P      X88 888 Y88b. Y8b.       |\s
            |     "Y8888P "Y88P"  888  888  888 88888P"   "Y88P"   88888P' 888  "Y888 "Y8888    |\s
            |                                   888                                             |\s
            |                                   888                                             |\s
            |                                   888                                             |\s
            |                                                                                   |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }

    public static void printDecoratorBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |                                                                               |\s
            |       dBBBBb  dBBBP  dBBBP  dBBBBP dBBBBBb dBBBBBb  dBBBBBBP dBBBBP dBBBBBb   |\s
            |         dBP               dBP.BP      dBP      BB          dBP.BP      dBP    |\s
            |    dBP dBP dBBP   dBP    dBP.BP   dBBBBK   dBP BB   dBP   dBP.BP   dBBBBK     |\s
            |   dBP dBP dBP    dBP    dBP.BP   dBP  BB  dBP  BB  dBP   dBP.BP   dBP  BB     |\s
            |  dBBBBBP dBBBBP dBBBBP dBBBBP   dBP  dB' dBBBBBBB dBP   dBBBBP   dBP  dB'     |\s
            |                                                                               |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }

    public static void printFacadeBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |                                                                                                                         |\s
            |                                                                                          dddddddd                       |\s
            |        ffffffffffffffff                                                                  d::::::d                       |\s
            |       f::::::::::::::::f                                                                 d::::::d                       |\s
            |      f::::::::::::::::::f                                                                d::::::d                       |\s
            |      f::::::fffffff:::::f                                                                d:::::d                        |\s
            |      f:::::f       ffffffaaaaaaaaaaaaa      cccccccccccccccc  aaaaaaaaaaaaa      ddddddddd:::::d     eeeeeeeeeeee       |\s
            |      f:::::f             a::::::::::::a   cc:::::::::::::::c  a::::::::::::a   dd::::::::::::::d   ee::::::::::::ee     |\s
            |     f:::::::ffffff       aaaaaaaaa:::::a c:::::::::::::::::c  aaaaaaaaa:::::a d::::::::::::::::d  e::::::eeeee:::::ee   |\s
            |     f::::::::::::f                a::::ac:::::::cccccc:::::c           a::::ad:::::::ddddd:::::d e::::::e     e:::::e   |\s
            |     f::::::::::::f         aaaaaaa:::::ac::::::c     ccccccc    aaaaaaa:::::ad::::::d    d:::::d e:::::::eeeee::::::e   |\s
            |     f:::::::ffffff       aa::::::::::::ac:::::c               aa::::::::::::ad:::::d     d:::::d e:::::::::::::::::e    |\s
            |      f:::::f            a::::aaaa::::::ac:::::c              a::::aaaa::::::ad:::::d     d:::::d e::::::eeeeeeeeeee     |\s
            |      f:::::f           a::::a    a:::::ac::::::c     ccccccca::::a    a:::::ad:::::d     d:::::d e:::::::e              |\s
            |     f:::::::f          a::::a    a:::::ac:::::::cccccc:::::ca::::a    a:::::ad::::::ddddd::::::dde::::::::e             |\s
            |     f:::::::f          a:::::aaaa::::::a c:::::::::::::::::ca:::::aaaa::::::a d:::::::::::::::::d e::::::::eeeeeeee     |\s
            |     f:::::::f           a::::::::::aa:::a cc:::::::::::::::c a::::::::::aa:::a d:::::::::ddd::::d  ee:::::::::::::e     |\s
            |     fffffffff            aaaaaaaaaa  aaaa   cccccccccccccccc  aaaaaaaaaa  aaaa  ddddddddd   ddddd    eeeeeeeeeeeeee     |\s
            |                                                                                                                         |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }

    public static void printFactoryMethodBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |                                                                                     |\s
            |      sSSs   .S_SSSs      sSSs  sdSS_SSSSSSbs    sSSs_sSSs     .S_sSSs     .S S.     |\s
            |     d%%SP  .SS~SSSSS    d%%SP  YSSS~S%SSSSSP   d%%SP~YS%%b   .SS~YS%%b   .SS SS.    |\s
            |    d%S'    S%S   SSSS  d%S'         S%S       d%S'     `S%b  S%S   `S%b  S%S S%S    |\s
            |    S%S     S%S    S%S  S%S          S%S       S%S       S%S  S%S    S%S  S%S S%S    |\s
            |    S&S     S%S SSSS%S  S&S          S&S       S&S       S&S  S%S    d*S  S%S S%S    |\s
            |    S&S_Ss  S&S  SSS%S  S&S          S&S       S&S       S&S  S&S   .S*S   SS SS     |\s
            |    S&S~SP  S&S    S&S  S&S          S&S       S&S       S&S  S&S_sdSSS     S S      |\s
            |    S&S     S&S    S&S  S&S          S&S       S&S       S&S  S&S~YSY%b     SSS      |\s
            |    S*b     S*S    S&S  S*b          S*S       S*b       d*S  S*S   `S%b    S*S      |\s
            |    S*S     S*S    S*S  S*S.         S*S       S*S.     .S*S  S*S    S%S    S*S      |\s
            |    S*S     S*S    S*S   SSSbs       S*S        SSSbs_sdSSS   S*S    S&S    S*S      |\s
            |    S*S     SSS    S*S    YSSP       S*S         YSSP~YSSY    S*S    SSS    S*S      |\s
            |    SP             SP                SP                       SP            SP       |\s
            |    Y              Y                 Y                        Y             Y        |\s
            |                                                                                     |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }

    public static void printFlyweightBanner() {
        System.out.println("""
           -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
           |                                                                                             |\s
           |    .s5SSSs.                                                                                 |\s
           |             .s        .s5 s.   .s s.  s.   .s5SSSs.   s.   .s5SSSs.   .s    s.  .s5SSSSs.   |\s
           |    sS                     SS.     SS. SS.        SS.  SS.        SS.        SS.    SSS      |\s
           |    SS       sS        ssS SSS  sS S%S S%S  sS    `:;  S%S  sS    `:;  sS    S%S    S%S      |\s
           |    SSSs.    SS         SSSSS   SS S%S S%S  SSSs.      S%S  SS         SSSs. S%S    S%S      |\s
           |    SS       SS          SSS    SS S%S S%S  SS         S%S  SS         SS    S%S    S%S      |\s
           |    SS       SS          `:;    SS `:; `:;  SS         `:;  SS   ``:;  SS    `:;    `:;      |\s
           |    SS       SS    ;,.   ;,.    SS ;,. ;,.  SS    ;,.  ;,.  SS    ;,.  SS    ;,.    ;,.      |\s
           |    :;       `:;;;;;:'   ;:'    `:;;:'`::'  `:;;;;;:'  ;:'  `:;;;;;:'  :;    ;:'    ;:'      |\s
           |                                                                                             |\s
           -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
           """);
    }

    public static void printIteratorBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |                                                                         |\s
            |     ██▓▄▄▄█████▓▓█████  ██▀███   ▄▄▄     ▄▄▄█████▓ ▒█████   ██▀███      |\s
            |    ▓██▒▓  ██▒ ▓▒▓█   ▀ ▓██ ▒ ██▒▒████▄   ▓  ██▒ ▓▒▒██▒  ██▒▓██ ▒ ██▒    |\s
            |    ▒██▒▒ ▓██░ ▒░▒███   ▓██ ░▄█ ▒▒██  ▀█▄ ▒ ▓██░ ▒░▒██░  ██▒▓██ ░▄█ ▒    |\s
            |    ░██░░ ▓██▓ ░ ▒▓█  ▄ ▒██▀▀█▄  ░██▄▄▄▄██░ ▓██▓ ░ ▒██   ██░▒██▀▀█▄      |\s
            |    ░██░  ▒██▒ ░ ░▒████▒░██▓ ▒██▒ ▓█   ▓██▒ ▒██▒ ░ ░ ████▓▒░░██▓ ▒██▒    |\s
            |    ░▓    ▒ ░░   ░░ ▒░ ░░ ▒▓ ░▒▓░ ▒▒   ▓▒█░ ▒ ░░   ░ ▒░▒░▒░ ░ ▒▓ ░▒▓░    |\s
            |     ▒ ░    ░     ░ ░  ░  ░▒ ░ ▒░  ▒   ▒▒ ░   ░      ░ ▒ ▒░   ░▒ ░ ▒░    |\s
            |     ▒ ░  ░         ░     ░░   ░   ░   ▒    ░      ░ ░ ░ ▒    ░░   ░     |\s
            |     ░              ░  ░   ░           ░  ░            ░ ░     ░         |\s
            |                                                                         |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }

    public static void printMediatorBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\s
            |                                                                                                                  |\s
            |   .sSSSsSS SSsSSSSS  .sSSSSs.     .sSSSSs.     SSSSS  .sSSSSs.     .sSSSSSSSSSSSSSs.  .sSSSSs.     .sSSSSSSSs.   |\s
            |   S SSS  SSS  SSSSS  S SSSSSSSs.  S SSSSSSSs.  S SSS  S SSSSSSSs.  SSSSS S SSS SSSSS  S SSSSSSSs.  S SSS SSSSS   |\s
            |   S  SS   S   SSSSS  S  SS SSSS'  S  SS SSSSS  S  SS  S  SS SSSSS  SSSSS S  SS SSSSS  S  SS SSSSS  S  SS SSSS'   |\s
            |   S..SS       SSSSS  S..SS        S..SS SSSSS  S..SS  S..SSsSSSSS  `:S:' S..SS `:S:'  S..SS SSSSS  S..SSsSSSa.   |\s
            |   S:::S       SSSSS  S:::SSSS     S:::S SSSSS  S:::S  S:::S SSSSS        S:::S        S:::S SSSSS  S:::S SSSSS   |\s
            |   S;;;S       SSSSS  S;;;S        S;;;S SSSSS  S;;;S  S;;;S SSSSS        S;;;S        S;;;S SSSSS  S;;;S SSSSS   |\s
            |   S%%%S       SSSSS  S%%%S SSSSS  S%%%S SSSS'  S%%%S  S%%%S SSSSS        S%%%S        S%%%S SSSSS  S%%%S SSSSS   |\s
            |   SSSSS       SSSSS  SSSSSsSS;:'  SSSSSsS;:'   SSSSS  SSSSS SSSSS        SSSSS        SSSSSsSSSSS  SSSSS SSSSS   |\s
            |                                                                                                                  |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\s
            """);
    }

    public static void printPrototypeBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\s
            |                                                                                                      |\s
            |   '########::'########:::'#######::'########::'#######::'########:'##:::'##:'########::'########:    |\s
            |    ##.... ##: ##.... ##:'##.... ##:... ##..::'##.... ##:... ##..::. ##:'##:: ##.... ##: ##.....::    |\s
            |    ##:::: ##: ##:::: ##: ##:::: ##:::: ##:::: ##:::: ##:::: ##:::::. ####::: ##:::: ##: ##:::::::    |\s
            |    ########:: ########:: ##:::: ##:::: ##:::: ##:::: ##:::: ##::::::. ##:::: ########:: ######:::    |\s
            |    ##.....::: ##.. ##::: ##:::: ##:::: ##:::: ##:::: ##:::: ##::::::: ##:::: ##.....::: ##...::::    |\s
            |    ##:::::::: ##::. ##:: ##:::: ##:::: ##:::: ##:::: ##:::: ##::::::: ##:::: ##:::::::: ##:::::::    |\s
            |    ##:::::::: ##:::. ##:. #######::::: ##::::. #######::::: ##::::::: ##:::: ##:::::::: ########:    |\s
            |   ..:::::::::..:::::..:::.......::::::..::::::.......::::::..::::::::..:::::..:::::::::........::    |\s
            |                                                                                                      |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\s
            """);
    }
    public static void printProxyBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |                                                                   |\s
            |   8b,dPPYba,   8b,dPPYba,   ,adPPYba,  8b,     ,d8  8b       d8   |\s
            |   88P'    "8a  88P'   "Y8  a8"     "8a  `Y8, ,8P'   `8b     d8'   |\s
            |   88       d8  88          8b       d8    )888(      `8b   d8'    |\s
            |   88b,   ,a8"  88          "8a,   ,a8"  ,d8" "8b,     `8b,d8'     |\s
            |   88`YbbdP"'   88           `"YbbdP"'  8P'     `Y8      Y88'      |\s
            |   88                                                    d8'       |\s
            |   88                                                   d8'        |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }

    public static void printSingletonBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            |                                                                                           |\s
            |      █████████   ███                      ████            █████                           |\s
            |     ███░░░░░███ ░░░                      ░░███           ░░███                            |\s
            |    ░███    ░░░  ████  ████████    ███████ ░███   ██████  ███████    ██████  ████████      |\s
            |    ░░█████████ ░░███ ░░███░░███  ███░░███ ░███  ███░░███░░░███░    ███░░███░░███░░███     |\s
            |     ░░░░░░░░███ ░███  ░███ ░███ ░███ ░███ ░███ ░███████   ░███    ░███ ░███ ░███ ░███     |\s
            |     ███    ░███ ░███  ░███ ░███ ░███ ░███ ░███ ░███░░░    ░███ ███░███ ░███ ░███ ░███     |\s
            |    ░░█████████  █████ ████ █████░░███████ █████░░██████   ░░█████ ░░██████  ████ █████    |\s
            |     ░░░░░░░░░  ░░░░░ ░░░░ ░░░░░  ░░░░░███░░░░░  ░░░░░░     ░░░░░   ░░░░░░  ░░░░ ░░░░░     |\s
            |                                  ███ ░███                                                 |\s
            |                                 ░░██████                                                  |\s
            |                                  ░░░░░░                                                   |\s
            |                                                                                           |\s
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
            """);
    }
}
