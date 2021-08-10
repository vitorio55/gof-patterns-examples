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
