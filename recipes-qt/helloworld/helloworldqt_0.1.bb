#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple QT helloworld application"
SECTION = "qt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PR = "r0"

SRC_URI = "git://github.com/timrule/qt-projects.git"
SRCREV = "master"

inherit qt4x11

S = "${WORKDIR}/git/helloworldqt"

do_compile() {
             qmake
             make
}

do_install() {
             install -d ${D}${bindir}
             install -m 0755 helloworldqt ${D}${bindir}
}

FILES_${PN} = "${bindir}/helloworldqt"

