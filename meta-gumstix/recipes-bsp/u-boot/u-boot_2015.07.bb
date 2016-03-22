require u-boot.inc

PV = "2015.07"

COMPATIBLE_MACHINE = "overo|duovero|pepper"

# v2015.07 = 33711bdd4a4dce942fb5ae85a68899a8357bdd94
SRCREV = "33711bdd4a4dce942fb5ae85a68899a8357bdd94"
SRC_URI = " \
    git://git.denx.de/u-boot.git;protocol=git;branch=master \
    file://0001-Update-the-rootfs-type-to-ext4-for-Overo-and-Pepper.patch \
    file://0002-Update-rootfs-type-to-ext4-for-DuoVero.patch \
    file://0003-Revert-ti-armv7-enable-EXT-support-in-SPL-using-ti_a.patch \
"
