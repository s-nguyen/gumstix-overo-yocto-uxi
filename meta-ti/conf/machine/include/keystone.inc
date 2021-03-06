SOC_FAMILY = "keystone"
require conf/machine/include/soc-family.inc

DEFAULTTUNE ?= "cortexa15thf-neon"
require conf/machine/include/tune-cortexa15.inc

PREFERRED_PROVIDER_virtual/kernel = "linux-keystone"
PREFERRED_PROVIDER_virtual/bootloader = "u-boot-keystone"
PREFERRED_PROVIDER_u-boot = "u-boot-keystone"

# Increase this everytime you change something in the kernel
MACHINE_KERNEL_PR = "r8"

KERNEL_IMAGETYPE = "uImage"

UBOOT_ENTRYPOINT = "0x80008000"
UBOOT_LOADADDRESS = "0x80008000"

EXTRA_IMAGEDEPENDS += "u-boot"
EXTRA_IMAGEDEPENDS += "boot-monitor"

MACHINE_FEATURES = "kernel26 apm usbgadget usbhost vfat pci"
MACHINE_FEATURES_BACKFILL_CONSIDERED = "rtc"
