package com.plcoding.bluetoothchat.domain.chat

import java.io.IOException

class TransferFailedException: IOException("Reading incoming data failed")