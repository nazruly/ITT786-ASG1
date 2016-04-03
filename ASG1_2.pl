#! /usr/bin/perl

use strict;
use warnings;
use IO::File ;
use IO::Compress::Deflate qw(deflate $DeflateError) ;

# read file into file stream $input
my $input = new IO::File "<NazrulYusni.txt"
    or die "Cannot open 'NazrulYusni.txt': $!\n" ;

# convert input data into buffer
my $buffer ;
deflate $input => \$buffer
    or die "Convert failed: $DeflateError\n";

# set output file
my $output = new IO::File ">NazrulYusni.bin"
    or die "Cannot open bin file: $!\n";

# write converted data into output file
print $output $buffer;

# output and input files are automatically closed
