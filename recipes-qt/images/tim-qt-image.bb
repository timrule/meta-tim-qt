include recipes-bsp/images/tim-imx28-bsp.bb

#CORE_IMAGE_EXTRA_INSTALL += " \
#        libsocketcan \
#        canutils \
#"

IMAGE_INSTALL += " \
        helloworldqt \
        canmon \
"

export IMAGE_BASENAME = "tim-image-qt"


