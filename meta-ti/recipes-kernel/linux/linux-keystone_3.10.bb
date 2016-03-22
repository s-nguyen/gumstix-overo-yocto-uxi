SECTION = "kernel"
DESCRIPTION = "Linux kernel for TI Keystone devices"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

COMPATIBLE_MACHINE = "keystone"

inherit kernel

require recipes-kernel/linux/linux-dtb.inc
require recipes-kernel/linux/setup-defconfig.inc

MACHINE_KERNEL_PR_append = "d"
PR = "${MACHINE_KERNEL_PR}"

KERNEL_DEVICETREE_k2hk-evm = "k2hk-evm.dtb"
KERNEL_DEVICETREE_k2e-evm = "k2e-evm.dtb"
KERNEL_DEVICETREE_k2l-evm = "k2l-evm.dtb"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

#This commit corresponds to "K2_LINUX_03.10.72_15.##"
SRCREV = "b9bad8fccc5f9c6bcd78363982b3249a15f193fb"
PV = "3.10.72+git${SRCPV}"

BRANCH = "v3.10.72/master"
SRC_URI = "git://git.ti.com/keystone-linux/linux.git;protocol=git;branch=${BRANCH}\
           file://defconfig\
           "

S = "${WORKDIR}/git"

RDEPENDS_kernel-base = ""
