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

    public static void printPrototypeBanner() {
        System.out.println("""
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\s
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
