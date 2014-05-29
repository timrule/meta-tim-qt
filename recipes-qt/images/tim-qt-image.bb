include recipes-bsp/images/tim-imx28-bsp.bb

IMAGE_INSTALL += " \
        helloworldqt \
        canmon \
"

export IMAGE_BASENAME = "tim-image-qt"
